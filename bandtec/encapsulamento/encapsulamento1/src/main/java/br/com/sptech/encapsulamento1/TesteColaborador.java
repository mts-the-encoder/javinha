/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.encapsulamento1;

/**
 * @author aluno
 */
public class TesteColaborador {
    public static void main(String[] args) {

        Colaborador colab1 = new Colaborador("mts", "estag", 1800.0);
        Colaborador colab2 = new Colaborador("soul", "software engineer", 18000.0);

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(colab1.toString());
        System.out.println(colab2.toString());

        rh.validarProm(colab1, "fullstack developer", 50.0);
        rh.validarProm(colab2, "product owner", 25.0);

        System.out.println(colab1.toString());
        System.out.println(colab2.toString());

        System.out.println("Salários ajustados : " + rh.getAjustados());
        System.out.println("Funcionários promovidos : " + rh.getPromovidos());
    }
}
