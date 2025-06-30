package com.mycompany.proje;

import java.util.Scanner;
public class Proje {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    int Num, Multi=0;

        System.out.println("Digite um numero e descubra sua tabuada");
        Num = t.nextInt();
        
    while(Multi<=20){
        System.out.println(Num + " X " + Multi + " = "+ Num*Multi);
        Multi++;
    }
    
    
    }
}
