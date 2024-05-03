package EstDeControle;

public class switches {
    public static void main(String[] args) {

        // statement that allows a variable to be tested for equality against a list of values.

        // case: insert a prompt, and what to do if it matches the prompt, and default is used for when nothing matches

        String day = "pizza";

        switch (day) {
            case "sunday" :
                System.out.println("it is sunday");
                break;
            case "monday" :
                System.out.println("it is monday");
                break;

            case "tuesday" :
                System.out.println("it is tuesday");
                break;

            case "wednesday" :
                System.out.println("it is wednesday");
                break;

            case "thursday" :
                System.out.println("it is thursday");
                break;

            case "friday" :
                System.out.println("it is friday");
                break;

            case "saturday" :
                System.out.println("it is saturday");
                break;

            default:
                System.out.println("that is not a day");

        }

    }
}
