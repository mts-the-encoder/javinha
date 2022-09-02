import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Digite um número para saber quantas vezes ele ocorre no vetor:");
        int number = scanner.nextInt();

        int qtd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                qtd++;
            }
        }
        System.out.printf("O número %d ocorre %d vezes", number, qtd);
    }
}