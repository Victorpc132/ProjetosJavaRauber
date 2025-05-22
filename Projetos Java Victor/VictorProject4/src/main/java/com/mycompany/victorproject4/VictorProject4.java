/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.victorproject4;

import java.util.Scanner;

public class VictorProject4 {

    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    double N1, N2;
    System.out.println("Digite um numero");
    N1 = teclado.nextDouble();
        System.out.println("Digite um segundo numero");
    N2 = teclado.nextDouble();
    
    
    if (N1>N2){
        System.out.println("o primeiro Numero e maior q o segundo "+N1+" E "+N2);
    }else{
        System.out.println("O segundo numero e maior q o primeiro "+N1+"E"+N2);
    }
    
    }
}
