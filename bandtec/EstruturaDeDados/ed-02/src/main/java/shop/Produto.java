package shop;

public abstract class Produto implements Vendavel {
    private Integer codigo;
    private Double precoCusto;

    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return String.format("Produto \n Codigo: %d, Preço de Custo: %.2f", codigo, precoCusto);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
