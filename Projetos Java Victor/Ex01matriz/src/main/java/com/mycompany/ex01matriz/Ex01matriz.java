/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex01matriz;

import java.util.Scanner;

public class Ex01matriz {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        String mat[][] = new String[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("digite um nome de personagem da linha: " + j + "coluna: " + i);
                mat[j][i] = T.nextLine();
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("esta escrito isso na linha: " + j + " da coluna: " + i + " == " + mat[j][i]);
            }
        }
    }
}
