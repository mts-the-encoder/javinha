import java.util.ArrayList;
import java.util.Scanner;

public class Inteiros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer numberUser;
        ArrayList<Integer> listPairs = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();

        do {
            System.out.println("Digite um numero inteiro");
            numberUser = scanner.nextInt();
            if (numberUser < 0) {
                System.out.println("opção inválido");
            }
            if (numberUser % 2 == 0 && numberUser != 0) {
                listPairs.add(numberUser);
            } else if (numberUser % 2 != 0) {
                listOdd.add(numberUser);
            }

        } while (numberUser != 0);
        System.out.println("Pares \n");
        System.out.println(listPairs + "\n");
        System.out.println("Impares \n");
        System.out.println(listOdd + "\n");

        ArrayList<Integer> listAll = new ArrayList<>();
        listAll.addAll(listPairs);
        listAll.addAll(listOdd);

        Integer sum = 0;
        Integer minValue = Integer.MAX_VALUE;
        Integer maxValue = Integer.MIN_VALUE;

        for (Integer listEv : listAll) {
            sum += listEv;
            if (listEv < minValue) {
                minValue = listEv;
            }
            if (listEv > maxValue) {
                maxValue = listEv;
            }
        }
        System.out.println("soma: ");
        System.out.println(sum + "\n");
        System.out.println("menor valor: ");
        System.out.println(minValue + "\n");
        System.out.println("maior valor: ");
        System.out.println(maxValue + "\n");
    }
}
