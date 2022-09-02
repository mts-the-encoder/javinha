import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%dº - %d\n", i + 1, arr[i]);
        }

        System.out.println("\n" + "Ordem Inversa de Add\n");
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.printf("%dº - %d\n", i+1, arr[i]);
        }

        System.out.println("\n" + "Ordem do menor ao Maior\n");
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}