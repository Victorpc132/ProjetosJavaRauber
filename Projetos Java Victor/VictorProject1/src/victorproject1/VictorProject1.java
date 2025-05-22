
package victorproject1;

import java.util.Scanner;

public class VictorProject1 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N;
        System.out.println("Digite um numero");
        N = teclado.nextDouble();
         
        if (N % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
    
}
