/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package victor.skye.fibonaccidowhilevictor;
import java.util.Scanner;
/**
 *
 * @author Victor
 */
public class FibonacciDoWhileVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num1=0, num2=1, cont=0, num;
        System.out.println("Informe o número de termos da série de Fibonacci: ");
        num = T.nextInt();
    do{
      num1=num1+num2;
      num2=num1+num2;
        System.out.println(num1+" , "+num2);
        cont++;
    }while(cont<num);
    }
}
