import java.util.Scanner;

public class ExOne {

    public static void main(String[] args) {

        String[] cars = new String[5];
        int[] yield = new int[5];
        Scanner sc = new Scanner(System.in);
        Scanner sInt = new Scanner(System.in);

        System.out.println("Digite o nome de cinco carros e seus repectivos rendimentos: \n");
        for (int i = 0; i < 5; i++) {
            cars[i] = sc.nextLine();
            yield[i] = sInt.nextInt();
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + ", ");
        }
        for (int i = 0; i < yield.length; i++) {
            System.out.print(yield[i] + ", ");
        }

        int x = 0;
        String car = "";
        for (int i = 0; i < yield.length; i++) {
            for (int j = 0; j < yield.length; j++) {
                if (yield[i] > yield[j]) {
                    x = yield[i];
                }
            }
        }
        System.out.println("\nO carro mais economico tem " + x + " de rendimento");
    }
}
