package subrotinas.ex03subrotinas;

import java.util.Scanner;

public class Ex03SubRotinas {

    static int segundosconvert(int totalsegundos) {
        int secs, horas, minutos;
        if (totalsegundos < 60) {
            System.out.println("Não ha segundos a converter");
        } else if (totalsegundos >= 3600) {
            horas = totalsegundos / 3600;
            secs = totalsegundos % 60;
            minutos = totalsegundos % horas;
            
            System.out.println("São " + horas + " horas " + minutos + " minutos e " + secs + " segundos");
        }
        else if(totalsegundos<3600){
            horas = totalsegundos / 3600;
            secs = totalsegundos % 60;
            minutos = totalsegundos / 60;
            System.out.println("São " + horas + " horas " + minutos + " minutos e " + secs + " segundos");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int num;
        System.out.println("Digite os segundos que eu transformarei entre horas minutos ");
        num = T.nextInt();
        num = segundosconvert(num);

    }
}
