package org.example;

class ContaSalario extends ContaCorrente {
    private int saquesGratuitos = 1;
    private static final double TAXA_SAQUE = 5.0;

    public ContaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
    }

    @Override
    public boolean sacar(double valor) {
        if (saquesGratuitos > 0) {
            saquesGratuitos--;
            return super.sacar(valor);
        } else {
            return super.sacar(valor + TAXA_SAQUE);
        }
    }
}
