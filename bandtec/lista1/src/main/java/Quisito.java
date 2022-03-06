import java.util.Scanner;

public class Quisito {
    public static void main(String[] args) {
        System.out.println("quantos filhos de 0 a 3 anos possui? \n");
        Scanner cacula = new Scanner(System.in);
        int primeiros = cacula.nextInt();

        System.out.println("quantos filhos de 4 a 16 anos possui.? \n");
        Scanner meio = new Scanner(System.in);
        int segundos = meio.nextInt();

        System.out.println("filhos de 17 a 18 anos possu? \n");
        Scanner velho = new Scanner(System.in);
        int ultimos = velho.nextInt();

        int total = primeiros + segundos + ultimos;

        double bolsaUm = primeiros * 25.12;
        double bolsaDois = segundos * 15.88;
        double bolsaTres = ultimos * 12.44;
        double bolsaTotal = bolsaUm + bolsaDois + bolsaTres;

        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",
                total, bolsaTotal));

    }
}
