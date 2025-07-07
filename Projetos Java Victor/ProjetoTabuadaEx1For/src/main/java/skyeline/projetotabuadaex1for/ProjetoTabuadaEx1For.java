
package skyeline.projetotabuadaex1for;

import java.util.Scanner;

public class ProjetoTabuadaEx1For {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
       for(int num=0 ;num<=10;num++){
        for (int multi=0; multi <= 10; multi++) {
            System.out.println(num + " X " + multi + " = " + num * multi);}
        }
    }
}
