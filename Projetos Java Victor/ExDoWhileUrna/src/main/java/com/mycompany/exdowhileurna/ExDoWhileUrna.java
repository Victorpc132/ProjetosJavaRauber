/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exdowhileurna;

import java.util.Scanner;


public class ExDoWhileUrna {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int votantes,voto=0, candA=0, candB=0, candC=0, nulo=0, branco=0, votou=0;
    System.out.println("quantos eleitores tem: ");
    votantes = T.nextInt();
    do{
        System.out.println("Digite 1 Para Candidato AAA");
        System.out.println("Digite 2 Para Candidato BBB");
        System.out.println("Digite 3 Para Candidato CCC");
        System.out.println("Digite 4 Para Branco");
        voto = T.nextInt();
        switch (voto) {
        case 1 -> candA++;
        case 2 -> candB++;
        case 3 -> candC++;
        case 4 -> branco++;
        default -> nulo++;
        
    }
        System.out.println("==================================");
        if(nulo> candA && nulo>candB && nulo>candC){
        System.out.println("Nulo tem mais votos : "+nulo);
        }else if(branco>candA && branco>candB && branco>candC){
            System.out.println(branco+"pessoas votaram em branco");
        }else if (candA>candB && candA>candC && candA>nulo){
            System.out.println("Candidato AAA é o Vencedor com: "+candA+" Votos");
        }else if (candB>candA && candB>candC && candB>nulo){ 
                System.out.println("Candidato BBB é o Vencedor com: "+candB+" Votos");
        }else if (candC>candB && candC>candA && candC>nulo){
                System.out.println("Candidato CCC é o Vencedor com: "+candC+" Votos");
        }else if(candA==candB && candA==candC && candB==candC) {
                System.out.println("Empate entre Candidato AAA, BBB e CCC");
        }else if(candA==candB) {
                System.out.println("Empate entre Candidato AAA e BBB ");
        }else if(candB==candC) {
                System.out.println("Empate entre Candidato BBB e CCC");
        }else if(candC==candA ) {
                System.out.println("Empate entre Candidato AAA e CCC");
            }
            System.out.println("==================================");
            votou++;
    }            while(votou<votantes);
  } 
}
    

