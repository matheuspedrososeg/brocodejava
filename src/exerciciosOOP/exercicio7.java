package exerciciosOOP;

import java.util.ArrayList;

public class exercicio7 {
    public static void main(String[] args) {

        seteMETODO2 banco = new seteMETODO2();

        seteMetodo conta1 = new seteMetodo("Matheus" , "123" , 3000);
        seteMetodo conta2 = new seteMetodo("Banana" , "124" , 12000);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        ArrayList< seteMetodo> contas = banco.getContas();

        for (seteMetodo conta : contas) {
            System.out.println(conta.informacoes());
        }

        banco.depositar(conta1, 10 );
        System.out.println("A conta: " + conta1.getConta() + " depositou " + 10 +  " reais.");
        System.out.println("Saldo: " + conta1.getDinheiro());

        banco.saque(conta1 , 30);
        System.out.println("A conta " + conta1.getConta() + " sacou " + 30 + " reais." );

        System.out.println("Saldo: " + conta1.getDinheiro());
    }
}
