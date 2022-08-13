package exercise;

public class Servico implements ITribruto{
    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Double getValorTributo(){
        return getPreco() * 0.12;
    }

    @Override
    public String toString() {
        return "Servico\n" +
                "\nDescrição: " + descricao +
                "\nPreço: " + preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
