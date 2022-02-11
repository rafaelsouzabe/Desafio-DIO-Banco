package br.com.banco.teste.util;

import br.com.banco.modelo.*;

public class TesteSaqueInvalido {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Cliente joao = new Cliente();
        joao.setNome("Joao Geraldo");
        Cliente maria = new Cliente();
        maria.setNome("Maria Jose");


        Conta conta1 = new ContaCorrente(joao);
        Conta conta2 = new ContaPoupanca(maria);

        System.out.println(conta1);
        System.out.println(conta2);

        try {

            conta1.sacar(1000);
        }catch (Exception ex){
            System.out.println("Saque Negado: " + ex.getMessage());
        }

        try {

            conta2.transferencia(500,conta1);
        }catch (Exception ex){
            System.out.println("Transferencia Negada: " + ex.getMessage());
        }


    }
}
