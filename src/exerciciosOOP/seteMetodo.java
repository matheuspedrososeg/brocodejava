package exerciciosOOP;

public class seteMetodo {

    String nome;
    String conta;
    double dinheiro;

    seteMetodo(String nome, String conta, double dinheiro) {
        this.nome = nome;
        this.conta = conta;
        this.dinheiro = dinheiro;


    }

    public String getNome () {
            return nome;
        } public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConta() {
        return conta;
    } public void setConta(String conta) {
        this.conta = conta;
    }

    public double getDinheiro() {
        return dinheiro;
    } public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    } public void deposito(double quantidade) {
        dinheiro += quantidade;
    } public void sacar(double quantidade) {
        dinheiro -= quantidade;
    } public String informacoes() {
        return "Nome: " + nome + " Conta: " + conta + " Saldo: " + dinheiro;
    }
}
