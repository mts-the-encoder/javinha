package com.company;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        System.out.println("Digite um número: \n");
        Scanner tabuada = new Scanner(System.in);
        Integer digito = tabuada.nextInt();

        System.out.printf("A tabuada do %d \n%n", digito);
        for (int i = 0; i <= 10; i++) {
            int res = digito * i;
            System.out.printf("%d X %d = %d%n", digito, i, res);
        }
        System.out.println("\n Fim da execução");
    }
}
