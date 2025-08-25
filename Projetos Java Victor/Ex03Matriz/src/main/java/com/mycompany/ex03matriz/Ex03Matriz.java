/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex03matriz;

import java.util.Scanner;

public class Ex03Matriz {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        int maior = mat1[0][0];
        
        
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite um valor para a coluna: " + coluna + " e linha: " + linha);
                mat1[linha][coluna] = T.nextInt();
                if (maior < mat1[linha][coluna]) {
                    maior = mat1[linha][coluna];
                }
            }
        }

        System.out.println("O numero maior da primeira Matriz é: "+maior);
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                mat2[linha][coluna] = mat1[linha][coluna]*maior;
                System.out.println("Digite um valor para a coluna: " + coluna + " e linha: " + linha);
            }
        }
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Na coluna: " + coluna + " e linha: " + linha+" da segunda matriz tem = "+mat2[linha][coluna]);
            }
        }
    }
}
