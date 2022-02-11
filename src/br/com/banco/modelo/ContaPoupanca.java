package br.com.banco.modelo;

import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        super.sacar(valor);
    }

    @Override
    public void deposito(double valor) {
        super.deposito(valor);
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) throws SaldoInsuficienteException {
        super.transferencia(valor, contaDestino);
    }

    @Override
    public String toString() {
        return "ContaPoupanca: " + super.toString();
    }
}
