package explicacaoMetodo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Metodos {

    public void soma(){
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");

        x = scanner.nextInt();

        System.out.println("digite o segundo numero: ");

        y = scanner.nextInt();

        System.out.println(x + y);;
    }

}
