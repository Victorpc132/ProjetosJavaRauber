/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package victor.skye.fibonacciwhilevictor;
import java.util.Scanner;
public class FibonacciWhileVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num, num1=0, num2=1, cont=0;
    System.out.println("Informe o número de termos da série de Fibonacci: ");
    num = T.nextInt();
    
    while(cont<num){
    num1=num1+num2;
    num2=num1+num2;
    cont++;
    System.out.println(num1+" , "+num2);
    }
    }
}
