import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        System.out.println("Digite seu nome: \n");
        Scanner leitor1 = new Scanner(System.in);
        String nome = leitor1.nextLine().toUpperCase();

        System.out.printf("Olá, %s! Qual o ano de seu nascimento? \n", nome);
        Scanner leitor2 = new Scanner(System.in);
        int ano = leitor2.nextInt();

        int futuro = 2030 - ano;

        System.out.printf("Em 2030 você terá %d anos", futuro);

    }
}
