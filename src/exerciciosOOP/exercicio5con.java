package exerciciosOOP;

import java.util.ArrayList;

public class exercicio5con {

    String nome;

    String autor;

    String ISBN;

    public static ArrayList< exercicio5con > ColecaoLivros = new ArrayList< exercicio5con >();


    exercicio5con(String nome, String autor, String ISBN) {
        this.nome = nome;
        this.autor = autor;
        this.ISBN = ISBN;
    } public String getNome() {
        return nome;
    } public void setNome(String nome) {
        this.nome = nome;
    } String getAutor() {
        return autor;
    } public String getISBN() {
        return ISBN;
    }  public void setAutor(String Autor) {

        this.autor = autor;
    } public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    } public static void adicionarLivro(exercicio5con Livro) {
        ColecaoLivros.add(Livro);
    } public static void removerLivro(exercicio5con Livro) {
        ColecaoLivros.remove(Livro);
    } public static ArrayList< exercicio5con> getColecaoLivros() {
        return ColecaoLivros;
    }



}
