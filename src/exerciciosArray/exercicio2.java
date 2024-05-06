package exerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        // Crie um programa que solicite o nome de 10 alunos juntamente com suas notas. Em seguida calcule a média
        // da turma e apresente o nome dos alunos que possuem nota menor a média da turma.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome dos 10 alunos:");
        String[] nomes = new String[10];

        String nome;

        int i = 0;

        do {
            nome = scanner.nextLine();
            i++;

            System.out.println("Insira o próximo nome: ");


        } while (i < 10);

        System.out.println("Agora insira nota do aluno: ");
        int[] notas = new int[10];

        int nota;

        int j = 0;


        do {
            nota = scanner.nextInt();
            j++;
            System.out.println("Insira a próxima nota:");
        } while (j < 10);
        {

            scanner.close();
        }
        for (int k : notas) {
            System.out.println(k);
        }





        }
    }
