/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02mancaracter;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Ex02ManCaracter {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        String frase;
        int cont=0;
        System.out.println("Informe uma frase");
        frase = T.nextLine();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == 'a' ||  frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) =='u'){
                cont++;
               
            }
            
        }
        System.out.println(frase+" tem "+cont+" vogais");
    }
}
