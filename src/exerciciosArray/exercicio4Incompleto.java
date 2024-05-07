package exerciciosArray;

import java.util.Scanner;

public class exercicio4Incompleto {
    public static void main(String[] args) {

        //  Crie um programa que solicite 10 números entre 1 e 50, depois o programa deve solicitar um novo número ao usuário também entre
        //  1 e 50. Por fim o programa deve verificar se o último número informado pelo usuário está contido dentro do array ou não.


        // resolver 2 bugs

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int numeronovo;
        int digitado;




        for (int i = 0; i < 10; i++) {



            digitado = scanner.nextInt();

            while (digitado < 1 || digitado > 50) {
                System.out.println("Insira um número de 1 a 50: ");


            }

        }





        System.out.println("Insira um novo número também entre 1 e 50: ");

            numeronovo = scanner.nextInt();










        }
    }

