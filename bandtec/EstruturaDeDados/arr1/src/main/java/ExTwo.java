import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {

        int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner scanner = new Scanner(System.in);

        int allDays = 0;
        int day = 0;
        int month = 0;

        day = scanner.nextInt();
        month = scanner.nextInt();
        allDays += day;

        for (int i = 0; i < month; i++) {
            allDays += months[i];
        }
        System.out.println("O dia " + day + "/" + month + " corresponde ao dia " +  allDays +"  do ano.");
    }
}
