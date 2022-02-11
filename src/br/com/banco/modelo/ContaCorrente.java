package br.com.banco.modelo;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
