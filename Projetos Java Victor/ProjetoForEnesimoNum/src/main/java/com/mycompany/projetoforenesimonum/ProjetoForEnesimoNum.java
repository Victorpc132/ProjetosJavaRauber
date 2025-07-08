/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoforenesimonum;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class ProjetoForEnesimoNum {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num1,acum, contador,enesimo=1;
        System.out.println("Digite o numero que deseja ver o enesimo");
        num1 = T.nextInt();
        System.out.println("Quantos deseja ver");
        acum = T.nextInt();
        enesimo=num1;
    for(contador=0;contador<=acum;contador++){
        enesimo=enesimo*2;
        System.out.println(enesimo);
    }
    }
}
