package OOP.constructors;

public class HumanoConstructors {

    // constructors = metodo especial que é chamado quando um objeto é criado.

    String name;
    int age;
    double weight;

    HumanoConstructors(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;



    }

    void eat() {
        System.out.println(this.name + " is eating.");

    }

    void drink() {
        System.out.println(this.name + " is drinking.");
    }






}
