package org.example;

class ContaInvestimento extends ContaBancaria {
    protected double taxaRetirada = 0.02;

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor * (1 + taxaRetirada);
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            return true;
        }
        return false;
    }
}
