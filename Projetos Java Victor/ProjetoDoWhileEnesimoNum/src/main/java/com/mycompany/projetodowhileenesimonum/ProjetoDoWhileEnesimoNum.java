/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetodowhileenesimonum;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class ProjetoDoWhileEnesimoNum {

    public static void main(String[] args) {
       Scanner T = new Scanner(System.in);
    int num1, acum, contador=0, enesimo=1;
        System.out.print("Digite o Numero que deseja ver o Enesimo: ");
        num1 = T.nextInt();
        System.out.print("Digite quantos deseja ver: ");
        acum = T.nextInt();
        enesimo=num1;
        do{
            enesimo=enesimo*2;
            System.out.println(enesimo);
            contador++;
        }while(contador<=acum);
    }
}
