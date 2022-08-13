package exercise;

public class Alimento extends Produto{
    private Integer qtdVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer qtdVitamina) {
        super(codigo, descricao, preco);
        this.qtdVitamina = qtdVitamina;
    }

    @Override
    public String toString() {
        return "Quantidade de Vitaminas: " + qtdVitamina +
                "\n Produto: " + super.toString();
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    public Integer getQtdVitamina() {
        return qtdVitamina;
    }

    public void setQtdVitamina(Integer qtdVitamina) {
        this.qtdVitamina = qtdVitamina;
    }
}
