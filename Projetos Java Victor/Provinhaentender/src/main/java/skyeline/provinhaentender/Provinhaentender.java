
package skyeline.provinhaentender;

import java.util.Scanner;


public class Provinhaentender {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int i=0, categoria,alt_coni2m=0,hora_vst,min_vst, visitas=0;
    double altura, arbusto=0, arvore=0, coniferas=0, out=0;
    
    while(i<15){
        System.out.println("Digite a categoria da planta");
        System.out.println("1-arbusto, 2-arvore");
        System.out.println("3-coniferas, 4-outras");
        
        categoria = T.nextInt();
        
        if(categoria == 1){
            arbusto++;
        }else if(categoria == 2) {
            arvore++;
        }else if(categoria == 3){
            coniferas++;
        }else if(categoria == 4){
            out++;
        }else {
            System.out.println("Nao existe essa categoria bro");
            i--;
        }
        
        System.out.println("Digite a altura da planta");
        altura = T.nextDouble();
        if (categoria == 3 && altura>2.0){
            alt_coni2m++;
        }
        
        System.out.println("Digite a hora da visita");
        hora_vst= T.nextInt();
        System.out.println("Digite os minutos da visita");
        min_vst= T.nextInt();
        
        if(min_vst>20 && hora_vst>=8){
            visitas++;
        }
        i++;
        
    }
    System.out.println("==============================================");
        System.out.println((arvore*15/100)+" % de arvores");
        System.out.println((coniferas*15/100)+" % de coniferas");
        System.out.println((out*15/100)+" % de outras");
        System.out.println((arbusto*15/100)+" % de arbustos");
        System.out.println(alt_coni2m+" coniferas tem mais de 2m de altura");
        System.out.println(visitas+" Visitas foram realizadas apos o horario");
    }
}
