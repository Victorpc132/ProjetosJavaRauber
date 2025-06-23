package com.mycompany.provaimparex2;
import java.util.Scanner;
public class Provaimparex2 {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    String nome1, nome2;
    int idade1, idade2;
    double mediaI;
    
        System.out.println("Digite o Nome de uma pessoa e a sua idade");
        nome1 = t.nextLine();
        idade1 = t.nextInt();
        t.nextLine();
        
        System.out.println("Digite o Nome de uma outra pessoa e a sua idade");
        nome2 = t.nextLine();
        idade2 = t.nextInt();
        
        if(idade1 > idade2) {
            System.out.println(nome1+" É mais velho que "+nome2);
        }else{
            System.out.println(nome2+" É mais velho que "+nome1);
        }
        mediaI = (idade1 + idade2) / 2;
        System.out.println("A media das idades é "+mediaI);
    }
}
