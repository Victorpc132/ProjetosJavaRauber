
package com.mycompany.vetor_animal;

import java.util.Scanner;

public class Vetor_animal {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int vet_num[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            vet_num[i]= T.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("=======================");
            System.out.println(vet_num[i]);
            System.out.println("=======================");
        }
        
    }
}
