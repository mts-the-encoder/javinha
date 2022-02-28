package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número entre 0 e 10");

        Integer numeroDigitado = leitor.nextInt();
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);

        if (numeroDigitado < 0 || numeroDigitado > 10) {

            System.out.println("Digite um número válido");
            System.exit(0);
        }


        Integer tentativas = 0;
        while (!numeroDigitado.equals(numeroSorteado)) {
            tentativas++;
            String resposta = String.format("Seu número escolhido foi o %d e o sorteado foi %d", numeroDigitado, numeroSorteado);
            System.out.println(resposta);
            System.out.println("Tente novamente:");
            numeroDigitado = leitor.nextInt();
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        }
        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas >= 4 && tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        tentativas = tentativas + 1;
        System.out.println(String.format("Tentativas = %d", tentativas));
    }

}
