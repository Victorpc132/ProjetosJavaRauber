/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04mancaracter;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Ex04ManCaracter {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        String nome;
        int space;
        System.out.println("Informe um nome completo");
        nome = T.nextLine();
        space = nome.indexOf(' ');
        nome = nome.substring(0,space); 
        System.out.println(nome);
    }
}
