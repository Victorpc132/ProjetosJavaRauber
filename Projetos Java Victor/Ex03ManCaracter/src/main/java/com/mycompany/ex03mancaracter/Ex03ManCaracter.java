/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03mancaracter;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Ex03ManCaracter {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        String frases ;
        int contspace = 0;
        System.out.println("informe umas frases ai que vou falar quantas palavras tem");
        frases=T.nextLine();
        
        for (int i = 0; i < frases.length(); i++) {
            if( frases.charAt(i) == ' '){
                contspace++;
            }
        }
        System.out.println("a frase tem "+(contspace+1)+" palavras");
    }
}
