package com.mycompany.ex05subrotinas;

import java.util.Scanner;

public class Ex05SubRotinas {

    static double mediaC(double a, double b, double c, String media) {
        double mediacalc = 0;
        double mediap;

        switch (media) {
            case "A":
                mediacalc = (a + b + c) / 3;
                break;
            case "B":
                mediacalc = ((a*5)+(b*3)+(c*2))/10;
                
                break;
            default:System.out.println("deu errado tenta denovo");
        }

        return mediacalc;
    }

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        double la, lb, lc;
        String media;
        double fim;
        System.out.println("Letra A - Média Aritmética");
        System.out.println("Letra B - Média Ponderada");
        media = T.nextLine();
        String mediaUp = media.toUpperCase();
        System.out.println("Digite 3 notas e escolha o tipo de média");
        la = T.nextDouble();
        lb = T.nextDouble();
        lc = T.nextDouble();
        fim = mediaC(la, lb, lc, mediaUp);
        System.out.println("A media é: "+fim);
    }
}
