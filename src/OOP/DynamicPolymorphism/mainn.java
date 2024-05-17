package OOP.DynamicPolymorphism;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {

        // polymorphism = muitas formas ou formatos.
        // dynamic = depoois de compilação (durante runtime)

        // ex: um corvette é: um corvette, um carro, um veiculo e um objeto.

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("1 = Dog, or 2 = Cat");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
        }

    }
}
