

package com.mycompany.provaimparex1;
import java.util.Scanner;
public class Provaimparex1 {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    String nome;
    int idade;
    double peso;

    System.out.println("Digite o nome idade e peso do competidor");
    nome = t.nextLine();
    idade = t.nextInt();
    peso = t.nextDouble();
    t.nextLine();
    
    if (idade > 12 && peso >= 35){
        System.out.println("O Competidor "+nome+" È Master");
    }else if (idade > 12 && peso < 35){
        System.out.println("O Competidor "+nome+" È Competidor");
    }else if (idade < 12 && peso > 35){
        System.out.println("O Competidor "+nome+" È Infantil");
    }else{
        System.out.println("O Competidor "+nome+" È Super Júnor");
    }

        
    }
}
