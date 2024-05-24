package OOP2.execptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exception = an event that occurs during the execution of a program that disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);


        try {

            System.out.println("enter a whole number to divide.");
            int x = scanner.nextInt();

            System.out.println("enter a whole number to divide.");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("you cant divide by 0, idiot.");
        }
        catch (InputMismatchException e) {
            System.out.println("you cant divide letters, idiot");
        }
        finally {
            System.out.println("this will always print.");
            scanner.close();
        }
    }
}
