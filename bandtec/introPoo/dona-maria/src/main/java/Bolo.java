public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;

    void comprarBolo(int qtdDesejada, Double valorTotal) {
        if (qtdDesejada > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else {
            quantidadeVendida += qtdDesejada;
            valor += (valorTotal * quantidadeVendida);
        }
    }

    void exibirRelatorio() {
        System.out.printf("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f \n", sabor, quantidadeVendida, valor);
    }


}