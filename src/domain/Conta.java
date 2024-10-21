package domain;

import exception.LimiteSaqueException;

public class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valorDeposito) {
        if (valorDeposito < 1) {
            throw new IllegalArgumentException("Valor de deposito inválido");
        }
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque) throws LimiteSaqueException {
        if (this.saldo < valorSaque) throw new LimiteSaqueException("Valor de saque maior do que o saldo");
        this.saldo -= valorSaque;
    }
}
