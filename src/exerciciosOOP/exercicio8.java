package exerciciosOOP;

public class exercicio8 {
    public static void main(String[] args) {

        oitoMetodo aluno1 = new oitoMetodo("Matheus" , 10 , "Matemática");
        System.out.println("Informações do Aluno:");
        aluno1.informacoes();

        System.out.println("adicionando cursos para: " + aluno1.getNome());
        aluno1.addCurso("Física");
        aluno1.addCurso("Inglês");

        System.out.println(aluno1.getCurso());
    }
}
