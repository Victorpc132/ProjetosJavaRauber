/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04subrotinas;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Ex04SubRotinas {

    static void triangulo(int l1,int l2,int l3){
        boolean tri;
        if (l1+l2>l3 && l2+l3>l1 && l1+l3>l2){
        tri = true;
        }else{
        tri = false;
        }
        
        if (tri == true && l1==l2 && l2==l3){
            System.out.println("Triangulo equilatero");
        }else if(tri == true && l1!=l2 && l2!=l3 & l3!=l1){
            System.out.println("Triangulo escaleno");
        }else if (tri = true && l1==l2 ||l1==l3 || l3==l2){
            System.out.println("Triangulo isosceles");
        }
    }
    
    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int tril1,tril2,tril3 ;
    System.out.println("Digite os lados que eu digo se da pra formar um triangulo");
    tril1 = T.nextInt();
    tril2 = T.nextInt();
    tril3= T.nextInt();
    triangulo(tril1, tril2, tril3);
    
    
    }
}
