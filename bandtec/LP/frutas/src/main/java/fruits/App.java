package fruits;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Frutas frutas = new Frutas();
        Scanner verFrutas = new Scanner(System.in);

        System.out.println("Digite uma fruta \n");
        String fruta = verFrutas.nextLine();

        if(fruta.equals(frutas)) {
            System.out.println("oie");
        } else {
            System.out.println("oieee");
        }

    }
}
