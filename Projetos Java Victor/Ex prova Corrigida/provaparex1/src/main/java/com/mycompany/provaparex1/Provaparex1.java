

package com.mycompany.provaparex1;
import java.util.Scanner;


public class Provaparex1 {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    String time1, time2;
    int gols1, gols2;
    double mediaG;
    
        System.out.println("Digite o Nome do Time1 e a quantidade de gols");
        time1 = t.nextLine();
        gols1 = t.nextInt();
        t.nextLine();
        
        System.out.println("Digite o Nome do Time2 e a quantidade de gols");
        time2 = t.nextLine();
        gols2 = t.nextInt();
        
        if(gols1 == gols2){
            System.out.println("Empate");
        }else if(gols1 > gols2){
            System.out.println(time1+" É o Campeão");
        }else{
            System.out.println(time2+" É o Campeão");
        }
        mediaG = (gols1 + gols2) / 2;
        System.out.println("a média de gols da partida é de: "+mediaG);
    }
}
