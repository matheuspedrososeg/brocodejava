package EstDeControle;

import java.util.Scanner;

public class mathclass {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.abs(y); // max finds the biggest number, while min does the opposite
        // abs shows the absolute value, e.g -10 becomes 10
        // sqrt = square root
        // .round = rounds to the nearest number
        // ceil will round to the next number
        // .floor goes to the previous number



        // pythagorean theorem

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side a: ");
        a = scanner.nextDouble();
        System.out.println("enter side b: ");
        b = scanner.nextDouble();

        // solve for c

        double a2 = Math.pow(a , 2);
        double b2 = Math.pow(b, 2);
        double addition = a2 + b2;
        double result = Math.sqrt(addition);

        System.out.println("The hyoptenuse is: " + result);




        scanner.close();


    }
}
