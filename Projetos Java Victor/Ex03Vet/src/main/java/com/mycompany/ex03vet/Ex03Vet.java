

package com.mycompany.ex03vet;

import java.util.Scanner;

public class Ex03Vet {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int tamanho=5, cont=0,cont2=0,cont3=0;
    
    String animal[]= new String[tamanho];
    String fruta[]= new String[tamanho];
    String inter[]= new String[10];
    
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os nomes dos animais");
            animal[i]= T.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite As Frutas");
            fruta[i] = T.nextLine();
            
        }while(cont<10){
            if(cont%2==0){
                inter[cont]=animal[cont2];
                cont2++;
            }else{
                inter[cont]=fruta[cont3];
                cont3++;
            }
            cont++;
        }
                 
            
        
        for (int i = 0; i < 10; i++) {
            System.out.println(inter[i]);
        }
    
    }
}
