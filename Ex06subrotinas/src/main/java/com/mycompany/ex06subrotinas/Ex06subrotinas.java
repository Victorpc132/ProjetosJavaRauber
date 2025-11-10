package com.mycompany.ex06subrotinas;

import java.util.Scanner;

public class Ex06subrotinas {

    static int jogoF(int hini, int mini, int hf, int mf) {
        int result = 0;
        hini = hini * 60 +mini;
        hf = hf * 60 + mf;
        if (hf< hini){
            hf+=24*60;
        }
        result=hf-hini;
        return result;
    }

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int hinicio, hfim, minicio, mfim;
        System.out.println("Digite o horario de inicio e os minutos de inicio de um jogo: ");
        hinicio = T.nextInt();
        minicio = T.nextInt();
        System.out.println("Agora digite os horarios do fim do jogo: ");
        hfim = T.nextInt();
        mfim = T.nextInt();
        int resultado = jogoF(hinicio, minicio, hfim, mfim);
        System.out.println(resultado + " Minutos de jogo");
    }
}
