package com.mycompany.provaparex2;

import java.util.Scanner;

public class Provaparex2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nome;
        int idade;
        double peso;

        System.out.println("Digite o nome idade e peso do competidor");
        nome = t.nextLine();
        idade = t.nextInt();
        peso = t.nextDouble();
        t.nextLine();

        if (idade < 17 && peso < 50) {
            System.out.println("O Competidor " + nome + " é Insuficiente para participar");
        } else if (idade < 17 && peso >= 50) {
            System.out.println("O Competidor " + nome + " é Júnior");
        } else if (idade > 17 && peso < 50) {
            System.out.println("O Competidor " + nome + " é Mini");
        } else {
            System.out.println("O Competidor " + nome + " é Pleno");
        }
    }
}
