/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entender;
import java.util.Scanner;
public class Entender {

    public static void main(String[] args) {
      Scanner T = new Scanner(System.in);
      int Inicio, Fim,Contador,Soma=0;
        System.out.println("DIgite o Numero de inicio");
        Inicio = T.nextInt();
        System.out.println("Digite o Numero de Fim");
        Fim = T.nextInt();
        
        if (Inicio > Fim){
            Contador=Inicio;
            Inicio=Fim;
            Fim=Contador;
        }
        if (Inicio % 2 == 0){
            Inicio++;
        }
        while(Inicio<=Fim){
            Soma+=Inicio;
            Inicio+=2;
            System.out.println("A Soma Dos impares é: " + Soma);
        }

    }
}
