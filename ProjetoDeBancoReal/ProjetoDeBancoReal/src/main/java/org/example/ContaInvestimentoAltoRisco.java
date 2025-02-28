package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double TAXA_RETIRADA = 0.05;
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaRetirada = TAXA_RETIRADA;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo - (valor * (1 + taxaRetirada)) >= SALDO_MINIMO) {
            return super.sacar(valor);
        }
        return false;
    }
}