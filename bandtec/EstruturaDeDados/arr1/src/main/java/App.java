import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] t1 = new String[10];
        String[] t2 = new String[10];

        Scanner sc = new Scanner(System.in);
        String name, nbhd;

        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um nome: ");
            name = sc.nextLine();
            System.out.println("Digite uma turma");
            nbhd = sc.nextLine();

            if (nbhd.equals("1")) {
                t2[c2] = name;
                c2++;
            } else {
                t1[c1] = name;
                c1++;
            }
        }

        System.out.println("Turma um: ");
        for (int i = 0; i < c1; i++) {
            System.out.print(t1[i] + ", ");
        }
        System.out.println("\n");
        System.out.println("Turma dois ");
        for (int i = 0; i < c2; i++) {
            System.out.print(t2[i] + ", ");
        }
    }
}
