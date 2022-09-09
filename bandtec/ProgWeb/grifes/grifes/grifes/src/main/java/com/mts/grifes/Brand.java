package com.mts.grifes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Brand {

    private String nome;
    private int anoCriacao;
    private int valorAcaoBolsa;
    @JsonIgnore
    private String chaveAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public int getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }

    public void setValorAcaoBolsa(int valorAcaoBolsa) {
        this.valorAcaoBolsa = valorAcaoBolsa;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
}
