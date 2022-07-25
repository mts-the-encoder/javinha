import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {

        System.out.println("Digite seu nome:");
        Scanner leitor1 = new Scanner(System.in);
        String nome = leitor1.nextLine().toUpperCase();

        System.out.println("Digite sua 1ª nota");
        Scanner leitor2 = new Scanner(System.in);
        double notaUm = leitor2.nextDouble();

        System.out.println("Digite sua 1ª nota");
        Scanner leitor3 = new Scanner(System.in);
        double notaDois = leitor3.nextDouble();

        double media = (notaUm + notaDois) / 2;

        System.out.printf("Olá, %s. Sua média foi de %.1f", nome, media);
    }
}

