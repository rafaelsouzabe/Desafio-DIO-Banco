package br.com.banco.modelo;

import java.io.Serializable;

public class Conta implements IConta, Comparable<Conta>, Serializable {
    protected static int AGENCIA_PADRAO = 111;
    protected static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor)throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + "Valor: " + valor);
        }
        this.saldo -=  valor;
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.deposito(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "br.com.banco.modelo.Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo, o.saldo);
    }
}
