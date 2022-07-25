/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.encapsulamento1;

/**
 * @author aluno
 */
public class RecursosHumanos {

    private Integer promovidos;
    private Integer ajustados;

    public RecursosHumanos() {
        this.ajustados = 0;
        this.promovidos = 0;
    }

    public Double ajustarPag(Colaborador func, Double adjust) {
        Double pagamento = func.getSalario();
        this.ajustados += 1;
        pagamento = ((adjust * pagamento) / 100) + pagamento;
        return pagamento;
    }

    public void promoteEmployee(Colaborador colaborator, String job) {
        colaborator.getNome();
        colaborator.setCargo(job);
        this.promovidos += 1;
    }

    public void validarProm(
            Colaborador colaborator,
            String newJob,
            Double adjust
    ) {
        Double adjustColPayment = ajustarPag(colaborator, adjust);

        if (adjustColPayment > colaborator.getSalario()) {
            colaborator.setSalario(adjustColPayment);
            this.promoteEmployee(colaborator, newJob);
        } else {

            System.out.println("operação inválida.");
        }
    }

    public Integer getPromovidos() {
        return promovidos;
    }

    public Integer getAjustados() {
        return ajustados;
    }
}
