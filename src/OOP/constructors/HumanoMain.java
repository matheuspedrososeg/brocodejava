package OOP.constructors;

import OOP.constructors.HumanoConstructors;

public class HumanoMain {
    public static void main(String[] args) {

        HumanoConstructors humano = new HumanoConstructors("Rick" , 65, 70);
        HumanoConstructors humano2 = new HumanoConstructors("Morty" , 16, 50);

        System.out.println(humano2.name);

        humano2.eat();
        humano.drink();
    }
}
