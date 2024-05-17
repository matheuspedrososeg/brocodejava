package exerciciosOOP;

public class seisMetodo {

    String trabalhador;

    String cargo;

    double salario;

    seisMetodo(String trabalhador, String cargo, double salario) {
        this.trabalhador = trabalhador;
        this.cargo = cargo;
        this.salario = salario;

    } public String getTrabalhador() {
        return trabalhador;
    } public String getCargo() {
        return cargo;
    } public double getSalario() {
        return salario;
    } public void setTrabalhador(String trabalhador) {
        this.trabalhador = trabalhador;
    } public void setSalario(double salario) {
        this.salario = salario;
    } public void aumento(double porcentagem) {
        salario = salario + salario * porcentagem / 100;
    } public void Informacoes() {
        System.out.println("Nome: " + trabalhador);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }


}
