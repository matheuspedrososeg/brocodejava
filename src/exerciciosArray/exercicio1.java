package exerciciosArray;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        // 1)Crie um programa que solicite ao usuário  5 números inteiros. Insira os números em um array e
        // em seguida calcule e apresente o valor da soma desses números.


        Scanner scanner = new Scanner(System.in);
        System.out.println("insira 5 numeros:"); // numeros digitados pelo usuario
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        int[] numeros = {n1 , n2 , n3 , n4 ,n5}; // array de numeros


        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i]; // soma do array
        }

        System.out.println("A soma dos numeros é: " + soma);

    }

}




