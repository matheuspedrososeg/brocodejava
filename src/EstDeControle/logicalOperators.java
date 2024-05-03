package EstDeControle;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {

        // && (and) both are true
        // || (or) either condition must be true
        // ! (not) reverses boolean

        int temp = 78;

        if (temp > 30) {
            System.out.println("it is hot outside");
        } else if(temp >= 20 && temp <= 30) {
            System.out.println("it is warm outside");
        } else {
            System.out.println("it is cold");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("you are playing a game, press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("you quit the game");
        } else {
            System.out.println("you are still playing the game");
        }




    }
}
