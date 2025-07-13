/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package victor.skye.primoforvictor;

import java.util.Scanner;
public class PrimoForVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num;
    boolean primo = true ;
    System.out.println("Esse e um programa para descobrir se o numero e primo!");
    System.out.print("Digite um numero:");
    num = T.nextInt();
    
    
    if(num <2){
        System.out.println("Nao Primo");
    }
    
for(int i=2;i<num;i++){   
    if(num % i ==0){
         primo = false;
         break;
    }
    }
    
    if(primo){
        System.out.println("Primo");
    }else{
        System.out.println("nao primo");
    }
    }
}

