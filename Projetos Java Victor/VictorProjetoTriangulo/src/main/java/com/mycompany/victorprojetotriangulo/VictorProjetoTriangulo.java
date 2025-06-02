
package com.mycompany.victorprojetotriangulo;

import java.util.Scanner;

public class VictorProjetoTriangulo {

    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int N1, N2, N3;
      System.out.println("Digite o primeiro lado: ");
      N1 = teclado.nextInt();
      System.out.println("Digite o segundo lado: ");
      N2 = teclado.nextInt();
      System.out.println("digite o terceiro lado: ");
      N3 = teclado.nextInt();
        
      
      if (N1>N2+N3 || N2 > N1+N3 || N3> N1+N2){
          System.out.println("Nao e um triangulo");
      } else if(N1==N2 && N2==N3 && N3 == N1){
          System.out.println("é um triangulo Equilatero");
      } else if (N1==N2 || N2==N3 || N3==N1){
          System.out.println("e um triangulo Isoceles");
      } else if (N1>N2 || N2>N3 || N3>N1){
                  System.out.println("e um triangulo Escaleno");
                  } else {
          System.out.println("Nao e um triangulo");
      }
    }
}
