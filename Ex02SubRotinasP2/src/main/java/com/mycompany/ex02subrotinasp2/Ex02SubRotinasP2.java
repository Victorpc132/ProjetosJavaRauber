/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02subrotinasp2;

/**
 *
 * @author alunos
 */
public class Ex02SubRotinasP2 {
    static void num0a100(int nu){
        if (nu>100){
            return;
        }else{
           System.out.println(nu+" ");
           num0a100(nu+1);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        num0a100(n);
        
    }
}
