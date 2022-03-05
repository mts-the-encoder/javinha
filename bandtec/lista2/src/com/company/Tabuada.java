package com.company;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        System.out.println("Digite um número: \n");
        Scanner tabuada = new Scanner(System.in);
        Integer digito = tabuada.nextInt();

        for (int i = 0; i <= 10; i++) {
            int res = digito * i;
            System.out.println(res);
        }

    }
}
