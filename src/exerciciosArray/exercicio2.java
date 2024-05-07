package exerciciosArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        // Crie um programa que solicite o nome de 10 alunos juntamente com suas notas. Em seguida calcule a média
        // da turma e apresente o nome dos alunos que possuem nota menor média da turma.

        Scanner scanner = new Scanner(System.in);


        String[] nomes = new String[10];
        double[] notas = new double[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome do " + (i + 1) + "° aluno:");

            nomes[i] = scanner.next();
            System.out.println("insira a nota do aluno: " + (i + 1) + "°");
            notas[i] = scanner.nextDouble();

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno: " + nomes[i] + " Nota: " + notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        double media = soma / 10;

        System.out.println("\nA media da turma é: " + media);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                System.out.println("\nO aluno: " + nomes[i] + " tirou: " + notas[i] + " e esta acima da média.");

            }
        }

scanner.close();
    }

}
