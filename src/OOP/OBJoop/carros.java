package OOP.OBJoop;

public class carros {
    String make = "Chevrolet";
    String model = "Chevette";
    ;
    int year = 1992;
    String color = "Cinza";
    double price = 18433.00;

    void drive() {
        System.out.println("you drive the car.");
    }
    void brake() {
        System.out.println("you step on the brakes.");
    }


    public String toString() {


        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}

