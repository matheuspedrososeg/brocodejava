package exerciciosOOP;

import java.util.ArrayList;

public class seteMETODO2 {
    public ArrayList< seteMetodo> contas;


    public seteMETODO2() {
        contas = new ArrayList<seteMetodo>();
    } public void adicionarConta(seteMetodo conta) {
        contas.add(conta);
    } public void removerConta(seteMetodo conta) {
        contas.remove(conta);
    }

    public void depositar(seteMetodo contas, double quantidade) {
        contas.deposito(quantidade);
    } public void saque(seteMetodo contas, double quantidade) {
        contas.sacar(quantidade);
    }

    public ArrayList< seteMetodo> getContas() {
        return contas;
    }
}
