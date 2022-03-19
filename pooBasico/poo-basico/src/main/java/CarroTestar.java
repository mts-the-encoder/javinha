public class CarroTestar {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.nome = "Uno da firma";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.velocidade = 60;

        c1.acelerar(10);
        System.out.println("Valocidade:" + c1.velocidade + "Km/h");

        c1.freiar(30);
        System.out.println("Velocidade:" + c1.velocidade + "Km/h");

        c1.buzinar();
    }
}
