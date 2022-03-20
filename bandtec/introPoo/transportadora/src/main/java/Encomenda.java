import java.util.Locale;

public class Encomenda {

    String tamanho;
    String enderecoRemente;
    String enederecoDestinatario;
    Double distancia;
    Double valorEncomenda = 0.00;
    Double frete = 0.00;

    void calcularFrete(String tamanho, Double distancia) {
        if (tamanho.equals("p".toUpperCase(Locale.ROOT))) {
            frete += (valorEncomenda * 1) / 100;
            tamanho = "Pequeno";
        } else if (tamanho.equals("m".toUpperCase(Locale.ROOT))) {
            frete += (valorEncomenda * 3) / 100;
            tamanho = "Médio";
        } else if (tamanho.equals("g".toUpperCase(Locale.ROOT))) {
            frete += (valorEncomenda * 5) / 100;
            tamanho = "Grande";
        }
        if (distancia <= 50) {
            frete += 3.00;
        } else if (distancia >= 51 && distancia <= 200) {
            frete += 5.00;
        } else if (distancia >= 201) {
            frete += 7.00;
        }
    }

    void emitirEtiqueta() {
        double valoTt = frete + valorEncomenda;
        System.out.printf("\n ***** ETIQUETA PARA ENVIO *****\n" +
                        "\n" +
                        "Endereço do remetente: %s\n" +
                        "\n" +
                        "Endereço do destinatário: %s\n" +
                        "\n" +
                        "Tamanho: %s\n" +
                        "\n" +
                        "--------------------------------------------------\n" +
                        "\n" +
                        "Valor encomenda: R$ % .2f\n" +
                        "\n" +
                        "Valor frete: R$ % .2f\n" +
                        "\n" +
                        "--------------------------------------------------\n" +
                        "\n" +
                        "Valor total: R$ %.2f \n", enderecoRemente, enederecoDestinatario, tamanho, valorEncomenda,
                frete, valoTt);
    }
}
