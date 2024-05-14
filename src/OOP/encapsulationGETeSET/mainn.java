package OOP.encapsulationGETeSET;

public class mainn {
    public static void main(String[] args) {

        // encapsulation = attributes of a class will be hidden or private, can be accessed only through methods ( getters & setters )
        // you should make attributes private if you dont have a reason to make them public/protected


      /*  Car car = new Car("Chevrolet" , "Chevette" , 1992);

        car.setYear(1993);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
*/

        Car car1 = new Car("Chevrolet" , "Chevette" , 1992);
        Car car2 = new Car("Volkswagen" , "Fusca" , 1967);

         car2.copy(car1);

      //  Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
