

package com.mycompany.projetonumeroimpar;
import java.util.Scanner;
public class ProjetoNumeroImpar {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    int NI, NF,Cont=0, Soma=0;
        System.out.println("Digite o Numero de inicio");
        NI = t.nextInt();
        System.out.println("Digite o Numero de fim");
        NF = t.nextInt();
        
    
    if (NI>NF){
        Cont=NI;
        NI=NF;
        NF=Cont;
    }
    
    if (NI % 2 ==0 ) {
            NI++;
        }
    
    while (NI<=NF){
         Soma+=NI;
         NI += 2;
        System.out.println("A soma dos números ímpares no intervalo é: " + Soma);
        
    }
    
    }
}
