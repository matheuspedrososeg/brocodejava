package exerciciosOOP;

public class exercicio2 {

    public static void main(String[] args) {

        exercicio2con cachorro1 = new exercicio2con("cachorro" , "golden retriever");

        System.out.println("O cachorro: " + cachorro1 .getname() + " é um " + cachorro1.getBreed() );

        System.out.println("Digite o novo nome do cachorro e sua raça.");

        cachorro1.setName("cachorro com nome diferente");
        cachorro1.setBreed("golden retriever");

        System.out.println(cachorro1.getname() + " agora é um " + cachorro1.getBreed());
    }
}
