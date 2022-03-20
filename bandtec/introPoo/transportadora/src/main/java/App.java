import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Encomenda e1 = new Encomenda();
        e1.tamanho = "Pequeno";
        e1.enederecoDestinatario = "haddock lobo";
        e1.enderecoRemente = "av paulista";
        e1.distancia = 40.00;
        e1.valorEncomenda = 70.00;

        e1.calcularFrete("p".toUpperCase(Locale.ROOT), 40.00);
        e1.emitirEtiqueta();

        Encomenda e2 = new Encomenda();
        e2.tamanho = "Grande";
        e2.enederecoDestinatario = "av paulista";
        e2.enderecoRemente = "haddock lobo";
        e2.distancia = 400.00;
        e2.valorEncomenda = 100.00;

        e2.calcularFrete("g".toUpperCase(Locale.ROOT), 400.00);
        e2.emitirEtiqueta();
    }
}

