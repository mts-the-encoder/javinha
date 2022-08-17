package com.example.demo;

public class Heroi {

    private String nome;
    private String hab;
    private double forca;
    private boolean vivo;
    private int idade;

    public Heroi(String nome, String hab, double forca, boolean vivo, int idade) {
        this.nome = nome;
        this.hab = hab;
        this.forca = forca;
        this.vivo = vivo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getHab() {
        return hab;
    }

    public double getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getIdade() {
        return idade;
    }
}
