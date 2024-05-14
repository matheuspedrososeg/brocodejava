package OOP.inheritance;

public class INHERITANCE extends veiculoINHERITANCE {
    public static void main(String[] args) {

        // inheritance = o processo onde uma classe adquire os atribuitos e metodos de outro.

        carINHERITANCE carro = new carINHERITANCE();

      //  carro.go();

        bicycleINHERITANCE bike = new bicycleINHERITANCE();

     //   bike.stop();

       // System.out.println(carro.speed);
      //  System.out.println(bike.speed);

        System.out.println(carro.doors);
        System.out.println(bike.pedals);

    }

}
