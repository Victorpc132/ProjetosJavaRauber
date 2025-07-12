

package victor.skye.fatorialwhilevictor;

import java.util.Scanner;
public class FatorialWhileVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num=1, fatorial, cont=0, acum=1;
        System.out.println("Digite o numero para ver seu fatorial");
        fatorial = T.nextInt();
        while(cont<fatorial){
            num = num*acum;
            cont++;
            acum++;
            System.out.println(num);
        }
    }
}
