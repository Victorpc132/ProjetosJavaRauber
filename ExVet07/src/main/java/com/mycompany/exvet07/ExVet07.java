package com.mycompany.exvet07;

import java.util.Scanner;

/*Faça um programa que preencha três vetores
com cinco posições cada. No primeiro vetor armazene
os nomes dos funcionários. No segundo o salário e no
terceiro o tempo de serviço de cada um. Mostre um
primeiro relatório com os nomes dos funcionários que
não terão aumento. E um segundo relatório com os
nomes e os novos salários dos funcionários que terão
aumento. Os funcionários que terão aumento serão
aqueles que tem tempo de serviço superior a 5 anos ou
salário inferior a R$ 1940. Sabe-se que os funcionários
que satisfizerem as duas condições terão 35% de
aumento. Para o funcionário que se enquadre apenas
com o tempo de serviço terá 25% de aumento. E se o
salário for inferior ao valor, terá 15% de aumento.*/
public class ExVet07 {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int funcionarios = 3;
        String nome[] = new String[3];
        Double salario[] = new Double[3];
        int tempo[] = new int[3];

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Digite qual o nome do empregado N" + (i + 1));
            nome[i] = T.nextLine();
        }
        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Digite o salario de " + nome[i]);
            salario[i] = T.nextDouble();
        }
        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Digite o tempo de trabalho de " + nome[i] + " Em meses");
            tempo[i] = T.nextInt();
        }
        System.out.println("=========================================================");
        for (int i = 0; i < funcionarios; i++) {
            if (tempo[i] < 61 && salario[i] > 1940) {
                System.out.println("O funcionario " + nome[i] + " nao recebera aumento");
            }
        }
        System.out.println("===========================================================");
        for (int i = 0; i < funcionarios; i++) {
            if (tempo[i] > 60) {
                salario[i] = salario[i] / 100 * 25;
                System.out.println(" o funcionario com aumento de 25% sera " + nome[i] + " com aumento de " + salario[i]);
            } else if (salario[i] < 1940) {
                salario[i] = salario[i] / 100 * 15;
                System.out.println("O funcionario com aumento de 15% sera " + nome[i] + " com aumento de " + salario[i]);
            }else if (tempo[i] > 60 && salario[i] < 1940) {
                salario[i] = salario[i] / 100 * 35;
                System.out.println("o funcionario com aumento de 35% sera " + nome[i] + " com aumento de " + salario[i]);
            }
        }
        System.out.println("===========================================================");
        T.close();
    }
}
