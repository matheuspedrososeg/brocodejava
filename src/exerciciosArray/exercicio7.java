package exerciciosArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Double[] numeros = new Double[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Insira um número aleatório: ");

            numeros[i] = scanner.nextDouble();


        }

        Arrays.sort(numeros);
        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.print("os números em forma decrescente são: ");
        System.out.println(Arrays.toString(numeros));







    }

}
