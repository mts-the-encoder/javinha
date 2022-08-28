package com.example.apicantores;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cantor {

    private int id;
    private String nome;
    @JsonIgnore
    private String senha;
    private String categoria;
    private double cache;
    private boolean constaNoSpotfy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public boolean isConstaNoSpotfy() {
        return constaNoSpotfy;
    }

    public void setConstaNoSpotfy(boolean constaNoSpotfy) {
        this.constaNoSpotfy = constaNoSpotfy;
    }
}
