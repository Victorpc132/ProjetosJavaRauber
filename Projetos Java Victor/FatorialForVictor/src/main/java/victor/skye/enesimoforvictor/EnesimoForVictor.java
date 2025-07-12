
package victor.skye.enesimoforvictor;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class EnesimoForVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num,num1=1, cont, acum=1;
    System.out.println("Digite o numero que deseja ver o fatorial");
    num = T.nextInt();
    for(cont=0;cont<num;cont++){
        num1=num1*acum;
        acum++;
        System.out.println(num1);
            
        }
    }
}
