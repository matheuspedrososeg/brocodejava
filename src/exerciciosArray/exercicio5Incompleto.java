package exerciciosArray;

import java.util.Scanner;

public class exercicio5Incompleto {
    public static void main(String[] args) {

// Crie um programa que solicite o nome de 10 pessoas e armazene em um array.
// Em seguida verifique e apresente o menor nome e o maior nome da lista.

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        String nomemaior = " ", nomemenor = " ";


        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome: ");

            nomes[i] = scanner.next();


            if (nomes[i].length() > nomemaior.length()) {
                nomemaior = nomes[i];


                //  if (nomes.length < nomemenor.length()) {

                //  }


            }
        }


        System.out.println("O maior nome da lista é: " + nomemaior);


        scanner.close();

    }
}


