/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.victorproject5;

import java.util.Scanner;

public class VictorProject5 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double N1, N2;
    System.out.println("Digite um numero");
    N1 = teclado.nextDouble();
    System.out.println("Digite um segundo numero");
    N2 = teclado.nextDouble();
    
    if(N1>N2){
        System.out.println("A ordem crescente e "+N2+" e "+N1);
    }else {
        System.out.println("A ordem crescente e "+N1+" e "+N2);
    }
    }
}
