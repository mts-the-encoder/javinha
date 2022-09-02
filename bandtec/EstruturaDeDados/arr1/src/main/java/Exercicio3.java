import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        boolean hasName = false;
        String nameSearch = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            if (nameSearch.equalsIgnoreCase(names[i])) {
                System.out.println("Nome encontrado no índice: "+i);
                hasName = true;
            }
        }

        if (!hasName) {
            System.out.println("Nome não encontrado");
        }
    }
}
