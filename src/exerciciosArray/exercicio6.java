package exerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

       // Crie um programa que solicite 10 números aleatórios e os
        // armazene em um array, em seguida ordene os valores do array de forma que os números informados fiquem na ordenação ascendente.

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Insira um número aleatório: ");

            numeros[i] = scanner.nextDouble();


        }

        Arrays.sort(numeros);

        System.out.print("os números em forma crescente são: ");
            System.out.println(Arrays.toString(numeros));






    }
}
