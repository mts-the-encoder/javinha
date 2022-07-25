import java.util.Scanner;

public class CalculadoTroco {

    public static void main(String[] args) {

        System.out.println("Informe o valor unitário de um produto \n");
        Scanner valorUnitario = new Scanner(System.in);
        int unitario = valorUnitario.nextInt();

        System.out.println("Informe a quantidade vendida \n");
        Scanner qtdVendida = new Scanner(System.in);
        int vendidos = qtdVendida.nextInt();

        System.out.println("Informe o valor pago pelo cliente.\n \n");
        Scanner pgtCliente = new Scanner(System.in);
        int valoPg = pgtCliente.nextInt();

        int troco = valoPg - (vendidos * unitario);

        String x = String.format("Seu troco será de R$ %d", troco);
        System.out.println(x);
    }
}
