/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package victor.skye.fibonacciforvictor;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class FibonacciForVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num, num1=0, num2=1, cont, acum;
        System.out.println("Informe o número de termos da série de Fibonacci: ");
        num = T.nextInt();
        if(num<=0){
            System.out.println("Valor de 0 e impossivel");
            }
            for(cont=0;cont<num;cont++){
                num1=num1+num2;
                num2=num1+num2;
                System.out.println(num1+" , "+num2);
        }
    }
}
