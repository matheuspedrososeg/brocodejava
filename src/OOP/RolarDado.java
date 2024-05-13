package OOP;

import java.util.Random;

public class RolarDado {

    Random random;
    int numero;

    RolarDado() {
        random = new Random();
        roll();
    }

    void roll() {
        numero = random.nextInt(6) + 1;
        System.out.println(numero);
    }

}

