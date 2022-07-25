import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        System.out.println("Digite seu salário bruto \n");
        Scanner leitorUm = new Scanner(System.in);
        int salario = leitorUm.nextInt();

        int inss = salario / 10;
        int ir = (salario * 20) / 100;

        System.out.println("Valor condução diária (ida) \n");
        Scanner condIda = new Scanner(System.in);
        double conducao = condIda.nextDouble();

        int vt = (int) (conducao * 2 * 22);

        int descontos = inss + ir + vt;
        int liquido = salario - descontos;

        String frase = String.format("Seu salário bruto é R$%d, tem um total de R$%d em descontos e receberá um líquido de R$%d", salario, descontos, liquido);
        System.out.println(frase);
    }
}

