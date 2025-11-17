
package subrotinas.ex02subrotinasp2;

import java.util.Scanner;



public class Ex02SubRotinasP2 {
    
    static boolean palindromo(String pal, int i, int j){
        if (i>=j) return true;
        if (pal.charAt(i)!=pal.charAt(j))return false;
        
        
        return palindromo(pal, i+1, j-1);
    }
    
    public static void main(String[] args) {
    Scanner T = new Scanner (System.in);
    String palavra;
    System.out.println("Digite a palavra");
    palavra = T.nextLine();
    System.out.println("a palavra: "+palavra+" "+palindromo(palavra, 0, palavra.length()-1));
        
    }
}
