package OOP.Polymorphism;

public class mainn {
    public static void main(String[] args) {

        // polymorphism = do grego (poly = muitos) e (morph = forma)
        // a habilidade de um objeto de identificar como mais de um tipo

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

       Veiculo[] racers = {car, bicycle, boat};

       for (Veiculo x : racers) {
           x.go();
       }

    }
}
