package exerciciosOOP;

import java.util.ArrayList;

public class oitoMetodo {

    String nome;

    double nota;

ArrayList< String > cursos;

    oitoMetodo(String nome, double nota, String curso) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = new ArrayList<String>();
    } public String getNome() {
        return nome;
    } public double getNota() {
        return nota;
    } public ArrayList<String> getCurso() {
        return cursos;
    } public void addCurso(String curso) {
        cursos.add(curso);
    } public void removeCurso(String curso) {
        cursos.remove(curso);
    }
    public void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
    }
}
