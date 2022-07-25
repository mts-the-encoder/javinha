package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Autenticador {

    public static void main(String[] args) {

        System.out.println("Digite seu nome: \n");
        Scanner user = new Scanner(System.in);
        String newUser = user.nextLine();

        System.out.println("Digite sua senha \n");
        Scanner psswd = new Scanner(System.in);
        String newPsswd = psswd.nextLine();

            while (!newUser.equals("admin") && !newPsswd.equals("#Bandtec")) {
                System.out.println("Login e/ou senha inválidos \n");

                System.out.println("Digite seu nome: \n");
                newUser = user.nextLine();

                System.out.println("Digite sua senha \n");
                newPsswd = psswd.nextLine();
            }
        if (Objects.equals(newUser, "admin") && Objects.equals(newPsswd, "#Bandtec")) {
            System.out.println("Login realizado com sucesso");
        }
    }
}
