package exercicio;

public abstract class Produto implements Vendavel {
    private int codigo;
    private double precoCusto;

    public Produto(int codigo, double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Produto: \n" +
                "\nCódigo: " + codigo +
                "\nPreço de Custo: " + precoCusto + "\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
