

package com.mycompany.exsub.rotinas1;

import java.util.Scanner;


public class ExSubRotinas1 {
    
    static double multF(double val1,double val2){
        double result;
        result = val1*val2;
        return result;
    }

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    double num1,num2,total;
        System.out.println("Digite dois numeros para multiplicar");
        num1 = T.nextDouble();
        num2 = T.nextDouble();
        total = multF(num1,num2);
        System.out.println("o resultado e "+total);
        
    }
}
