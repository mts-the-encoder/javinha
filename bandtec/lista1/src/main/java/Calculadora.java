import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("Digite um número \n");
        Scanner leitorUm = new Scanner(System.in);
        Integer digitoUm = leitorUm.nextInt();

        System.out.println("Digite mais um número \n");
        Scanner leitorDois = new Scanner(System.in);
        Integer digitoDois = leitorDois.nextInt();

        int soma = digitoUm + digitoDois;
        System.out.printf("Resultado da soma: \n %d%n", soma);

        int subtracao = digitoUm - digitoDois;
        System.out.printf("Resultado da subtração: \n %d%n", subtracao);

        int multiplicacao = digitoUm * digitoDois;
        System.out.printf("Resultado da multiplicação: \n %d%n", multiplicacao);

        double divisao = (double) digitoUm / digitoDois;
        System.out.printf("Resultado da divisão: \n %.1f%n", divisao);
    }
}
