package com.mts.apilutadores;

public class Fighter {

    private String nome;
    private int forcaGolpe;
    private int forcaDefesa;
    private int vida = 100;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(int forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public int getForcaDefesa() {
        return forcaDefesa;
    }

    public void setForcaDefesa(int forcaDefesa) {
        this.forcaDefesa = forcaDefesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
