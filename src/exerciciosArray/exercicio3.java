package exerciciosArray;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        // 3)Crie um programa que solicite o nome de 10 alunos juntamente
        // com suas notas. Em seguida calcule a média da turma e apresente o nome dos alunos que possuem nota menor a média da turma.

        Scanner scanner = new Scanner(System.in);


        String[] nomes = new String[10];
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome dos " + (i + 1) + " aluno:");

            nomes[i] = scanner.next();
            System.out.println("insira a nota do aluno: " + (i + 1) +  "°");
            notas[i] = scanner.nextDouble();

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno: " + nomes[i] +  " Nota: " + notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        double media = soma / 10;

        System.out.println("\nA media da turma é: " + media);



        for (int i = 0; i < 7; i++) {
            if (notas[i] < 7) {
                System.out.println("O Aluno: " + nomes[i] +  " tirou: " + notas[i] + " e está abaixo da média.");


        }

        }



    }
}
