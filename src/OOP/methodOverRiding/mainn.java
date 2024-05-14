package OOP.methodOverRiding;

public class mainn {
    public static void main(String[] args) {

        // method overriding = declara um metodo em uma sub classe, que ja esta presente em uma classe parent.
        // feito para que a classe child consiga dar sua propria implementação


        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();

    }
}
