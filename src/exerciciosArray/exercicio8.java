package exerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {


        // 08) Crie um programa que solicite 20 números aleatórios. Em seguida crie dois novos arrays. O primeiro
        // array deverá armazenar todos os números impares do array original e o
        // segundo array deverá armazenar todos os números pares. Ao final apresente os valores armazenados nos arrays de números impares e pares.

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        int input;

        for (int i = 0; i < 20; i++) {
            System.out.println("Insira um número aleatório.");
            input = scanner.nextInt();

            numeros.add(input);

            if (input % 2 == 0) {
                par.add(numeros.get(i));
            }
            else {
                impar.add(numeros.get(i));
            }

        }
        System.out.println("Números impares: " + impar);
        System.out.println("Números pares: " + par );
    }
}






