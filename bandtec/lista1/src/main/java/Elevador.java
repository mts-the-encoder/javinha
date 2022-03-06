import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {

        System.out.println("Digite o peso máx suportado por seu elevador \n");
        Scanner pesoEl = new Scanner(System.in);
        int elevador = pesoEl.nextInt();

        System.out.println("Digite o limite de pessoas no seu elevador \n");
        Scanner qtdEl = new Scanner(System.in);
        int limite = qtdEl.nextInt();

        System.out.println("Informe o peso da 1ª pessoa que entrou no elevador \n");
        Scanner pessoaUm = new Scanner(System.in);
        int umaPessoa = pessoaUm.nextInt();

        System.out.println("Informe o peso da 2ª pessoa que entrou no elevador \n");
        Scanner pessoaDois = new Scanner(System.in);
        int duasPessoas = pessoaDois.nextInt();

        System.out.println("Informe o peso da 3ª pessoa que entrou no elevador \n");
        Scanner pessoaTres = new Scanner(System.in);
        int tresPessoas = pessoaTres.nextInt();

        int pesoMax = umaPessoa + duasPessoas + tresPessoas;

        System.out.printf("Entraram 3 pessoas no elevador, no qual cabem %d pessoas \n%n", limite);
        System.out.printf("O peso total no elevador é de %d, sendo que ele suporta %d%n", pesoMax, elevador);
    }
}
