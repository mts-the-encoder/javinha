public class App {

    public static void main(String[] args) {

        Bolo b1 = new Bolo();
        b1.sabor = "Chocolate";
        b1.valor = 0.00;
        b1.quantidadeVendida = 0;

        Bolo b2 = new Bolo();
        b2.sabor = "Abacaxi";
        b2.valor = 0.00;
        b2.quantidadeVendida = 0;

        Bolo b3 = new Bolo();
        b3.sabor = "Morango";
        b3.valor = 0.00;
        b3.quantidadeVendida = 0;

        b1.comprarBolo(101, 50.00);
        b2.comprarBolo(5, 35.00);
        b3.comprarBolo(75, 42.00);

        b1.exibirRelatorio();
        b2.exibirRelatorio();
        b3.exibirRelatorio();


    }
}
