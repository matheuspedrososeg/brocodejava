package OOP.AbstractKeyword;

public class mainn {
    public static void main(String[] args) {

        // abstract = classe abstract nao pode ser instanciada, mas elas podem ter uma subclasse.
        // metodos abstratos sao declarados sem uma implementação


        // Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();

        carro.go();

    }
}
