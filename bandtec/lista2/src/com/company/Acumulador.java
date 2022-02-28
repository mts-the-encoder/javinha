package com.company;

import java.util.Scanner;

public class Acumulador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer acumulador = -1;
        Integer soma = 0;
        System.out.println("Digite um número para calcular a soma deles");
        Integer numeroDigitado = leitor.nextInt();

        do {
            acumulador++;
            soma += acumulador;
            System.out.println(acumulador);
        } while (acumulador < numeroDigitado);

        String resultado = String.format("A soma dos números é %d", soma);
        System.out.println(resultado);
    }
}
