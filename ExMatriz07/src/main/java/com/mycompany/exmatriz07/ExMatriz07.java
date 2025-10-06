/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exmatriz07;

import java.util.Scanner;

/*7) Faça um programa com vetores e matrizes, que atenda o seguinte menu descrito a
seguir. Considere como 40 alunos e 10 disciplinas a capacidade máxima do programa.
Menu:
1 – Cadastrar um nome Disciplina (vetor)
2 – Cadastrar um nome de Aluno (vetor)
3 – Cadastrar uma Média de aluno em disciplina (matriz)
4 – Listar disciplinas;
5 – Listar alunos;
6 – listar alunos e respectiva média em determinada disciplina;
0 – Sair;
 
 */
public class ExMatriz07 {

    public static void main(String[] args) {
    Scanner T = new Scanner(System.in);
    int alunos = 4;
    int menu = 0;
    String nome[] = new String[alunos];
    String disciplina [] = new String[10];
    double media[][] = new double[alunos][3];
        for (int i = 0; i < alunos; i++) {
            System.out.println("1 – Cadastrar um nome Disciplina");
            System.out.println("2 - Cadastrar um nome de aluno");
            System.out.println("3 - Cadastrar uma media de aluno em disciplina");
            System.out.println("4 - Listar Disciplinas");
            System.out.println("5 - Listar alunos");
            System.out.println("6 - Listar alunos e respectiva media em determinada disciplina");
            System.out.println("0 - sair");
            
            menu = T.nextInt();
            for (int j = 0; j < alunos; j++) {
                if(menu == 1){
                    System.out.println(" Digite o nome da disciplina "+(j+1));
                    disciplina[j] = T.nextLine();
                }else if(menu == 2){
                    System.out.println(" Digite o Nome do aluno"+(j+1));
                    nome[j] = T.nextLine();
                }else if(menu == 3){
                    
                    System.out.println("Digite a media do aluno"+nome[j]);
                }
            }
        
    
        
            
        }
    }
}
