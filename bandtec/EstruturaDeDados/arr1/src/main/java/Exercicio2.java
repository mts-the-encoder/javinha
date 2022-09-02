import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        int avg = 0;
        System.out.println("\nMédia dos números:\n");
        for (int i : arr) {
            avg += i;
        }
        System.out.println("média: "+ avg/arr.length);

        System.out.println("Números acima da média:\n");
        for (int i = 0; i < 10; i++) {
            if (arr[i] > avg/arr.length) {
                System.out.println(arr[i] + "\n");
            }
        }
    }
}
