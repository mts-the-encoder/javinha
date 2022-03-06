import java.util.Locale;
import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {

        System.out.println("Digite seu login \n");
        Scanner login = new Scanner(System.in);
        String newLogin = login.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("Digite sua senha \n");
        Scanner senha = new Scanner(System.in);
        String newSenha = senha.nextLine().toUpperCase(Locale.ROOT);

        System.out.println("Quantas vezes vc aceita errar a senha antes do bloqueio \n");
        Scanner bloqueio = new Scanner(System.in);
        int bloqueioUsuario = bloqueio.nextInt();

        System.out.printf("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado", newLogin, newSenha, bloqueioUsuario);
    }
}
