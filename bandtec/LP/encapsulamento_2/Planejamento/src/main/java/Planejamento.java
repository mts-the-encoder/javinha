public class Planejamento {

    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados = 0;


    public Planejamento(String atividade, String responsavel, Integer diasEstimados, Integer diasUsados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = diasUsados;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }


    public String calcularTempo() {
        Integer diasAtrasados = diasUsados - diasEstimados;
        Integer diasSobrando = diasEstimados - diasUsados;
        if(getDiasUsados() > getDiasEstimados()) {
            System.out.printf("Você estimou %d dias, mas a tarefa\n" +
                    "foi feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa",
                    getDiasEstimados(), getDiasUsados(), diasAtrasados);
        } else if (getDiasEstimados() > getDiasUsados()) {
            System.out.printf("Você estimou %d dias, e a tarefa foi feita em %d dias " +
                    "(%d dias a menos que o estimado). Parabéns!", getDiasEstimados(),
                    getDiasUsados(), diasSobrando);
        } else {
            System.out.printf("Você estimou %d dias, e a tarefa foi feita em %d dias, " +
                    "atendendo a estimativa com precisão", getDiasEstimados(), getDiasUsados());
        }
        return null;
    }
    @Override
    public String toString() {
        return calcularTempo();
    }

}
