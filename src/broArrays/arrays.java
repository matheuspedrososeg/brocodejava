package broArrays;

public class arrays {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable
        // use arrays: [] after string, and {} to store a value



      //  String[] cars = {"camaro" , "corvette" , "tesla" , "bmw"};

        //cars[0] = "mustang";

        // System.out.println(cars[1]);

        String[] cars = new String[3];
        cars[0] = "camaro";
        cars[1] = "corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }


    }
}
