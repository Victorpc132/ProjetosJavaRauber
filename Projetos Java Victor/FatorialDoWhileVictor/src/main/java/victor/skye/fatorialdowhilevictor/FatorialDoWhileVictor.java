
package victor.skye.fatorialdowhilevictor;
import java.util.Scanner;
public class FatorialDoWhileVictor {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int num=1, fatorial, cont=0, acum=1;
        System.out.println("Digite o numero para saber o fatorial");
    fatorial = T.nextInt();
    do{
     num = num*acum;
        System.out.println(num);
     acum++;
     cont++;
    }while(cont<fatorial);
    }
}
