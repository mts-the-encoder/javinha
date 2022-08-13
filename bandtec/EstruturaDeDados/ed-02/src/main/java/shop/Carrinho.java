package shop;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> sales;

    public Carrinho() {
        sales = new ArrayList<>();
    }

    public void addVendavel(Vendavel v){
        sales.add(v);
        System.out.println("Produto adicionado com sucesso!");
        System.out.println(v.toString());
    }

    public Double calculaTotalVenda(){
        Double total = 0.0;
        for (Vendavel v : sales) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        for (Vendavel p : sales) {
            System.out.println(p);
        }
    }

}
