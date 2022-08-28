package exercicio;

public class Servico implements Vendavel {

    private String descricao;
    private int codigo;
    private int qtdHoras;
    private double valorHora;

    public Servico(String descricao, int codigo, int qtdHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return valorHora * qtdHoras;
    }

    @Override
    public String toString() {
        return "Servico: \n" +
                "Descrição: " + descricao + "\n" +
                "Código: " + codigo + "\n" +
                "Quantidade de Horas: " + qtdHoras + "\n" +
                "Valor da Hora: " + valorHora + "\n";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
