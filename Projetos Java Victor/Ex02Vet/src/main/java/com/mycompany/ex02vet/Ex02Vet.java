
package com.mycompany.ex02vet;

import java.util.Scanner;

public class Ex02Vet {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num[]= new int [10];
    
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 numeros");
            num[i] = T.nextInt();
            
        }
        for (int i = 0; i < 10; i++) {
            if(num[i]%2==0){
                System.out.println(num[i]);}
            
        }
    }
}
