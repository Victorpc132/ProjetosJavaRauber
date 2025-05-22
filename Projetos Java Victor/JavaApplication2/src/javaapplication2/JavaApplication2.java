
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    double C, F;
        System.out.println("Digite em celsius para transformar em fahrenheit");
    C = teclado.nextDouble();
    F = (C *9)/5+32;
        System.out.println("Em Fahrenheit fica:"+F);
    }
    
}
