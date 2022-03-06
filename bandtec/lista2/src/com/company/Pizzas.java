package com.company;

import java.util.Scanner;

public class Pizzas {

    public static void main(String[] args) {

        Escolha esc = new Escolha();

        boolean selecionado = false;

        while (!selecionado) { // Enquanto "val"for "false" o while vai ficar fazendo loop, mas quando se tornar "true" ele vai parar
            int opcao = esc.menu();
            selecionado = esc.escolher(opcao);
        }
    }
}


class Escolha {

    int mussarela = 0;
    int calabresa = 0;
    int quatroQueijos = 0;

    public boolean escolher(int escolha) {
        switch (escolha) {
            case 5:
                mussarela++;
                break;
            case 25:
                calabresa++;
                break;
            case 50:
                quatroQueijos++;
                break;
        }
        System.out.printf("\n mussarela = %d \n calabresa = %d \n 4 queijos = %d \n%n", mussarela, calabresa, quatroQueijos);
        if (mussarela + calabresa + quatroQueijos == 10) {
            if (mussarela > calabresa && mussarela > quatroQueijos) {
                System.out.printf("O sabor favorito é mussarela com %d votos \n%n", mussarela);
            } else if (calabresa > mussarela && calabresa > quatroQueijos) {
                System.out.printf("O sabor favorito é calabresa com %d votos \n%n", calabresa);
            } else if (quatroQueijos > mussarela && quatroQueijos > calabresa) {
                System.out.printf("O sabor favorito é 4 queijos com %d votos \n%n", quatroQueijos);
            }
            System.exit(0);
        }
        return false;
    }

    public int menu() {

        System.out.println("Escolha o sabor de pizza fav \n" + "5 - mussarela \n" + "25 - calabresa \n" + "50 - 4 queijos \n");
        Scanner pizzas = new Scanner(System.in);

        return pizzas.nextInt(); // retorna o numero que o usuário escreveu
    }
}