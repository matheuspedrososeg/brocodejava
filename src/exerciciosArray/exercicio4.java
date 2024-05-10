package exerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {

    public static boolean numeroExiste(ArrayList<Integer> numeros, int numeroAlvo) {

        for (int numeroinserido : numeros) {

            if (numeroinserido == numeroAlvo) {

                return true;

            }

        }

        return false;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int numeronovo;
        int digitado;




    for (int i = 0; i < 3; i++) {
        System.out.println("Insira o " + (i + 1) + "° número válido de 1 a 50:");
        digitado = scanner.nextInt();

        numeros.add(digitado);

        while (digitado < 1 || digitado > 50) {
            System.out.println("Número Inválido, Tente novamente.");
            digitado = scanner.nextInt();

            numeros.add(digitado);
        }


    }




            System.out.println("Insira um número que ja foi inserido no array: ");

            numeronovo = scanner.nextInt();

            boolean numerovalido = numeroExiste(numeros, numeronovo);

            if (numerovalido) {

                System.out.println("O número " + numeronovo + " está dentro do array.");

            } else {

                System.out.println("O número " + numeronovo + " não está dentro do array.");

            }


        }


    }









