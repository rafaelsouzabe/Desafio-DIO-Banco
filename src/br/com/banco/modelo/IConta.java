package br.com.banco.modelo;

public interface IConta {
    void sacar(double valor) throws SaldoInsuficienteException;
    void deposito(double valor);
    void transferencia(double valor, Conta contaDestino ) throws SaldoInsuficienteException;

}
