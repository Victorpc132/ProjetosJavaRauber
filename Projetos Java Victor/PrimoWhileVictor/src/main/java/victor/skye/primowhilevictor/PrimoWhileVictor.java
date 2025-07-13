/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package victor.skye.primowhilevictor;

import java.util.Scanner;

/**
 *
 * @author Vmano
 */
public class PrimoWhileVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int i = 2, num;
    boolean primo = true;
    
    System.out.println("Esse é um programa para descobrir se o número é primo!");
    System.out.print("Digite um número: ");
    num = T.nextInt();
    
    if(num < 2){
        System.out.println("Nao e primo");
    }else{
        primo = true;
        
        while(i <num){
            if(num % i == 0){
                primo = false;
                break;
            }
            i++;
        }
    }
    if(primo){
        System.out.println("Primo");
    }else{
        System.out.println("Nao Primo");
    }
    }
}
