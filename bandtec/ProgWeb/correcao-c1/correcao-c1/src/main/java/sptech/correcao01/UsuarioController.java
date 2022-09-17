package sptech.correcao01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario novoUsuario) {
        if (novoUsuario.getNome().length() > 3 && novoUsuario.getSenha().length() > 3) {
            usuarios.add(novoUsuario);
            return ResponseEntity.status(201).body(novoUsuario);
        }
        return ResponseEntity.status(400).body(novoUsuario);
    }

    @PostMapping("/autenticacao/{usuario}/{senha}")
    public ResponseEntity<Usuario> logonUsuario(@PathVariable String usuario,
                                @PathVariable String senha) {
        for (Usuario usuarioAtual : usuarios) {
            if (usuarioAtual.autenticar(usuario, senha)) {
                return ResponseEntity.status(200).body(usuarioAtual);
            } 
        }
        return ResponseEntity.status(404).body(null);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        return ResponseEntity.status(200).body(this.usuarios);
    }

    @DeleteMapping("/autenticacao/{usuario}")
    public ResponseEntity<String> logoffUsuario(@PathVariable String usuario) {
        for (Usuario usuarioAtual : usuarios) {
            if (usuarioAtual.getUsuario().equals(usuario)) {
                if (usuarioAtual.isAutenticado()) {
                    usuarioAtual.setAutenticado(false);
                    return ResponseEntity.status(200).
                            body(String
                                    .format("Logoff do usuário %s concluído", usuarioAtual.getNome()));
                } else {
                    return ResponseEntity.status(401)
                            .body(String
                                    .format("Usuário %s NÃO está autenticado", usuarioAtual.getNome()));
                }
            }
        }
        return ResponseEntity.status(204)
                .body(String
                        .format("Usuário %s não encontrado", usuario));
    }

    // EndPoints extras:

    @GetMapping("/autenticados")
    public ResponseEntity<List<Usuario>> getUsuariosAutenticados() {
        return ResponseEntity.status(200).body(usuarios.stream()
                .filter(Usuario::isAutenticado)
                .collect(Collectors.toList()));
    }

    @DeleteMapping("/autenticacao")
    public ResponseEntity<String> logoffGeral() {
        for (Usuario usuario : usuarios) {
            usuario.setAutenticado(false);
        }
        return ResponseEntity.status(200).body("Todos os usuarios sofreram logoff!");
    }

    @GetMapping("/relatorio")
    public ResponseEntity<String> getRelatorio() {
        long autenticados = usuarios.stream()
                                    .filter(Usuario::isAutenticado)
                                    .count();

        return  ResponseEntity.status(200).body(String.format(
                "Total de usuários: %s. Autenticados: %d. Não autenticados: %s",
                usuarios.size(), autenticados, usuarios.size() - autenticados
        ));
    }
}

