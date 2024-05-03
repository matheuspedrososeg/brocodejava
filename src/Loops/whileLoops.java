package Loops;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {

        // while loop = executes a block of code as long as its condition remains true
        //

        Scanner scanner = new Scanner(System.in);
        String name = "";

      do {
          System.out.println("enter your name: ");
          name = scanner.nextLine();
      } while (name.isBlank());

        System.out.println("Hello " + name);





      //  while (name .isBlank()) { // is blank, avoid people not putting anything
        //    System.out.println("enter your name: ");
          //  name = scanner.nextLine();

        }




    }

