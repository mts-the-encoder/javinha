import java.io.PrintStream;

public class Pet {

    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca, Integer qtdVisitas, Double valorGasto) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = qtdVisitas;
        this.valorGasto = valorGasto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    @Override
    public String toString() {
        return String.format("\n nome: %s \n raça: %s \n quantidade de visitas: %d \n valor gasto: %.1f",
                nome, raca, qtdVisitas, valorGasto);
    }
}