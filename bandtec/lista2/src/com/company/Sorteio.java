package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("informe um número entre 1 e 100");

        int numeroDigito = numero.nextInt();

        int pares = 0;
        int impares = 0;

        int sortador = 0;

        while (sortador < 200) {
            sortador++;

            int numeroSorteio = ThreadLocalRandom.current().nextInt(0, 100);

            if (numeroDigito == sortador) {
                System.out.println(String.format("O número %d apareceu na %dª rodada", numeroDigito, numeroSorteio));
            }
            if (numeroSorteio % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println(String.format("Foram sorteados %d números pares", pares));
        System.out.println(String.format("Foram sorteados %d números impares", impares));
    }
}
