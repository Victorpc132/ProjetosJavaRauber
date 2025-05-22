
package com.mycompany.victorproject2;

import java.util.Scanner;

public class VictorProject2 {

    public static void main(String[] args) {  
     Scanner teclado = new Scanner(System.in);
    double N;
        System.out.println("Digite um numero");
    N = teclado.nextDouble();
    
    if (N % 3==0 && N % 2==0 ){
        System.out.println("O numero e divisivel");
    }else {
        System.out.println("o numero nao e divisivel");
    }
    
    }
}
