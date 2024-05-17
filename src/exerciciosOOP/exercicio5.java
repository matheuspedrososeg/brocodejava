package exerciciosOOP;
import java.util.ArrayList;
public class exercicio5 {
    public static void main(String[] args) {

        exercicio5con livro1 = new exercicio5con("1984" , "George Orwell" , "9780198185215" );
        exercicio5con livro2 = new exercicio5con("Fahrenheit 451" , "Ray Bradbury" , "9783060311354");

        exercicio5con.adicionarLivro(livro1);
        exercicio5con.adicionarLivro(livro2);


        ArrayList< exercicio5con> Colecao = exercicio5con.getColecaoLivros();

        System.out.println("Lista de livros.");

        for (exercicio5con Livro : Colecao) {
            System.out.println(Livro.getNome() + " por " + Livro.getAutor() + " ISBN: " + Livro.getISBN());


        }

        Colecao.remove(livro1);

        System.out.println("\n Você removeu: " + livro1.nome  + "\n");

        System.out.println("Lista de livros: ");


        for (exercicio5con Livros : Colecao) {
            System.out.println(Livros.getNome() + " por " + Livros.getAutor() + " ISBN: " + Livros.getISBN());
        }

    }
}
