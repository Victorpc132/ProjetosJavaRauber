
package com.mycompany.exdowhileprojectvictor2;
import java.util.Scanner;
public class ExDoWhileProjectVictor2 {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int cadastre,senhacorreta , senhausuario;
        System.out.println("Digite uma senha para cadastrar");
        cadastre = T.nextInt();
        senhacorreta=cadastre;
        System.out.println("Digite a senha de 4 digitos");
        senhausuario = T.nextInt();
        
        do{
            System.out.println("Senha incorreta, Digite a senha novamente");
            senhausuario = T.nextInt();
        }while(senhausuario!=senhacorreta);
        System.out.println("Senha Correta");
    }
}
