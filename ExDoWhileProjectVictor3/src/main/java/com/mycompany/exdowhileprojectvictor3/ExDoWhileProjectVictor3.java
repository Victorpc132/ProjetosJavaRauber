

package com.mycompany.exdowhileprojectvictor3;
import java.util.Scanner;
public class ExDoWhileProjectVictor3 {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    double numeros, media, soma=0, vezesD=-1;
    
        do{
            System.out.println("Digite Numeros");
            numeros=T.nextDouble();
            soma= soma+numeros;
            vezesD++;
        }while(numeros!=0);
        media=soma/vezesD;
        System.out.println("parei, a quantidade de numeros digitados é: "+vezesD+" a média é: "+media);
    }
}
