

package com.mycompany.ex02matriz;

import java.util.Scanner;


public class Ex02Matriz {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int mat[][]= new int [3][3];
    int menor = mat[0][0];
    
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Digite um valor para a coluna: "+coluna+" e linha: "+linha);
                mat[linha][coluna] = T.nextInt();
                
            }
        }
        
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (menor > mat[linha][coluna]){
                    menor = mat[linha][coluna];
                }
            }
        }
        System.out.println(menor);
    
        
    }
}
