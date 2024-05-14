package OOP.interfacee;

public class mainn {
    public static void main(String[] args) {

        // interface = um template que pode ser aplicada a uma classe. semelhante a inheritance, mas especifica o que a classe tem ou deve fazer.
        // classes conseguem aplicar mais de uma interface, inheritance é limitada a 1 super

        Fish fish = new Fish();

        fish.flee();
    }
}
