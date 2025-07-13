package victor.skye.primodowhilevictor;

import java.util.Scanner;

public class PrimoDoWhileVictor {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int i = 2, num;
        boolean primo = true;

        System.out.println("Esse é um programa para descobrir se o número é primo!");
        System.out.print("Digite um número: ");
        num = T.nextInt();

        if (num < 2) {
            System.out.println("Não Primo");
        } else {
            primo = true;
           do{
           if(num % i ==0){
               primo = false;
               break;
           }
           i++;
           }while(i < num);
            if (primo) {
                System.out.println("Primo");
            } else {
                System.out.println("Não Primo");
            }
        }
    }
}
