
package com.mycompany.victorproject3;

import java.util.Scanner;

public class VictorProject3 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    double N;
    System.out.println("Digite um numero");
    N = teclado.nextDouble();
    
    if (N % 5==0||N % 7 ==0){
        System.out.println("O Numero e divisivel");
    }else {
        System.out.println("O Numero nao e dividido");
    }
    }
}
