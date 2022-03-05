package com.company;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        System.out.println("Potenciação \n" +
                            "Digite a base: ");
        Scanner base = new Scanner(System.in);
        int digitoBase = base.nextInt();
        int digitoBase2 = digitoBase;

        System.out.println("Digite o expoente");
        Scanner expoente = new Scanner(System.in);
        int digitoExpoente = expoente.nextInt();

        int i = 0;
        int pot = digitoBase * digitoExpoente;

        while (i < digitoExpoente) {
            digitoBase += digitoBase2;
            i++;
        }
        System.out.println(pot);
    }
}
