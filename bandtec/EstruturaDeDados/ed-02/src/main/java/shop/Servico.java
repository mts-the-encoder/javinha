package shop;

public class Servico implements Vendavel {
    private String descricao;
    private Integer codigo;
    private Integer qtdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer qtdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorVenda() {
        return qtdHoras * valorHora;
    }

    @Override
    public String toString() {
        return  "Servico:\n " +
                "\nDescrição: " + descricao + '\'' +
                "\nCódigo: " + codigo +
                "\nQuantidade de Horas: " + qtdHoras +
                "\nValor da Hora: " + valorHora +
                "\nValor da Venda: " + getValorVenda() + "\n";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
