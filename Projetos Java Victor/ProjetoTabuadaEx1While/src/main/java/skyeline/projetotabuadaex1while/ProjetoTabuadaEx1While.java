/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package skyeline.projetotabuadaex1while;

/**
 *
 * @author alunos
 */
public class ProjetoTabuadaEx1While {

    public static void main(String[] args) {
    int num=0, multi=0;
     while(num<=10){
        while(multi<=10){
            System.out.println(num+" X "+multi+" = "+ num*multi);
            multi++;
        }
        num++;
        multi=0;
    }    
    }
}
