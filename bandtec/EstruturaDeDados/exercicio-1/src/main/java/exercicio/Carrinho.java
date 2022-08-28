package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> vendas;

    public Carrinho() {
        this.vendas = new ArrayList<Vendavel>();
    }

    public void addVendavel(Vendavel vendavel) {
        this.vendas.add(vendavel);
    }

    public double calculaTotalVenda() {
        double total = 0.0;
        for (Vendavel vendavel : vendas) {
            total += vendavel.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho() {
        for (Vendavel vendavel : vendas) {
            System.out.println(vendavel);
        }
    }

    public List<Vendavel> getVendas() {
        return vendas;
    }

    public void setVendas(List<Vendavel> vendas) {
        this.vendas = vendas;
    }
}
