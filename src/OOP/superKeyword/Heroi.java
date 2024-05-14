package OOP.superKeyword;

public class Heroi extends Pessoa{

    String power;

    Heroi(String name, int age, String power) {
        super(name, age); // utiliza-se para passar nome e idade para a classe parente "pessoa"

        this.power = power;
    } public String toString() {

        return super.toString() + this.power;

    }
}
