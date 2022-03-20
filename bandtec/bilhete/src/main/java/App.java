public class App {

    public static void main(String[] args) {

        BilheteUnico bilhete1 = new BilheteUnico();

        bilhete1.nome = "Matheus";
        bilhete1.saldo = 40.00;

        bilhete1.carregar(60.00);
        bilhete1.usar();
        bilhete1.exibirStatus();

        BilheteUnico bilhete2 = new BilheteUnico();

        bilhete2.nome = "James";
        bilhete2.saldo = 500.00;

        bilhete2.carregar(745.00);
        bilhete2.usar();
        bilhete2.exibirStatus();
    }
}
