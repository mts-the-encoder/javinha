public class TesteTermometro {

    public static void main(String[] args) {

        Termometro t1 = new Termometro();
        t1.temperaturaAtual = 40;
        t1.temperaturaMin = 20;
        t1.temperaturaMax = 60;

        t1.diminuiTemperatura(10);
        t1.exibirFahreihheit(40);
        t1.temperatura();
    }
}
