/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package skyeline.projetoex1while;

/**
 *
 * @author alunos
 */
public class Projetoex1while {

    public static void main(String[] args) {
    int num=0, multi=0 ;
    do{
        do{
          
           System.out.println(num+" X "+multi+" = "+num*multi); 
          multi++;
        }while(multi<=10);
        num++;
        multi=0;
    }while(num<=10);
    }
}
