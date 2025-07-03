

package com.mycompany.exdowhileprojectexpoente;

import java.util.Scanner;
public class ExDoWhileProjectexpoente {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        double base=1;
        int expoente, acum=0;
        System.out.println("Digite uma base");
        base = T.nextDouble();
        System.out.println("Digite um expoente");
        expoente = T.nextInt();
        
        do{
            base=expoente*base;
            acum+=1;
        }while(acum!=expoente);
        System.out.println("O resultado fica"+base);
    }
}
