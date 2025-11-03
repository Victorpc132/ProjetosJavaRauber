

package com.mycompany.exsubrotinas2;

import java.util.Scanner;


public class ExSubRotinas2 {
    
    static int intervalF(int val1,int val2){
        int result =0;
        int cont= 0;
        if(val1 == val2){
            return 0;
        }
        else if (val2>val1) {
            int val3;
            val3 = val1;
            val1=val2;
            val2 = val3;
        }
              cont = val2;
        while(cont<=val1) {
            
            result = result + cont;
            cont++;
            
            
        }
        return result;
    }

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num1,num2,fim;
    
        System.out.println("Digite dois numeros que eu calcularei o intervalo entre eles");
        num1 = T.nextInt();
        num2 = T.nextInt();
        fim = intervalF(num1, num2);
        if (fim != 0) {
         System.out.println("a soma do intervalo e "+fim);
           
        }else{
            System.out.println("os valores sao iguais a soma deles e "+fim);
        }
        
    }
}
