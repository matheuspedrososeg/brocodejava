package exerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicios2d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        String nome;

        int i = 0;

        System.out.println("Insira o primerio nome: ");

        do {
            nome = scanner.nextLine();
            i++;

            System.out.println("insira o proximo nome:");
        } while (i < 10);
        {

         for (String j : nomes) {
             System.out.println(j);


            }

        }

    }
}
