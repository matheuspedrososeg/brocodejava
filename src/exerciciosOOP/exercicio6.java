package exerciciosOOP;

public class exercicio6 {
    public static void main(String[] args) {

        seisMetodo empregado1 = new seisMetodo("Banana" , "Engenheiro" , 3900);
        seisMetodo empregado2 = new seisMetodo("Melancia" ,"Desenvolvedor" , 4200 );

        empregado1.Informacoes();
        empregado2.Informacoes();

        empregado1.aumento(10);
        empregado2.aumento(20);

        System.out.println("\n Novos salários: ");
        empregado1.Informacoes();
        empregado2.Informacoes();

    }
}
