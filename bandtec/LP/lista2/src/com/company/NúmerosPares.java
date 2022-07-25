package com.company;

public class NúmerosPares {

    public static void main(String[] args) {

        int i = 0;
        while (i < 40) {
            i++;
            if (i % 2 == 0) {
                System.out.println("Números pares \n" + i);
            }
        }
    }
}
