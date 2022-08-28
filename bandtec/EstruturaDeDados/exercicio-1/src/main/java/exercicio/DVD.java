package exercicio;

public class DVD extends Produto {

    private String nome;
    private String gravadora;

    public DVD(int codigo, double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public double getValorVenda() {
        return super.getPrecoCusto() + (super.getPrecoCusto() * 0.20);
    }

    @Override
    public String toString() {
        return super.toString() +
                "DVD:" +
                "Nome: " + nome + "\n" +
                "Gravadora: " + gravadora + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
