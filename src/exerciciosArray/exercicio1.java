package exerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        // 1)Crie um programa que solicite ao usuário  5 números inteiros. Insira os números em um array e
        // em seguida calcule e apresente o valor da soma desses números.


        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número inteiro: ");

            numeros[i] = scanner.nextInt();


        }

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];

        }

        System.out.println("A soma dos números inseridos é: " + soma);



    }

}




