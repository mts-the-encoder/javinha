package school.sptech.projetoormads.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.projetoormads.entities.MusicaEntity;
import school.sptech.projetoormads.repositories.MusicaRepository;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaRepository musicaRepository;

    @GetMapping
    public ResponseEntity<List<MusicaEntity>> listar() {
        List<MusicaEntity> musicas = musicaRepository.findAll();

        if (musicas.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(musicas);
    }

    @PostMapping
    public ResponseEntity<MusicaEntity> cadastrar(@RequestBody MusicaEntity musica) {
        MusicaEntity msc =  musicaRepository.save(musica);

        return ResponseEntity.status(201).body(msc);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicaEntity> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.of(this.musicaRepository.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicaEntity> atualizar(@PathVariable Integer id,
                                                  @RequestBody MusicaEntity musica) {
        if (this.musicaRepository.existsById(id)){
            MusicaEntity music = this.musicaRepository.save(musica);
            return ResponseEntity.status(200).body(musica);
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Integer id) {
        if (this.musicaRepository.existsById(id)) {
            this.musicaRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }
}
