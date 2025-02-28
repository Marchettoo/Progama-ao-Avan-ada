package org.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(123, "João", 1000, 500);
        ContaBancaria cp = new ContaPoupanca(456, "Maria", 2000);
        ContaBancaria ci = new ContaInvestimento(789, "Carlos", 5000);
        ContaBancaria cs = new ContaSalario(321, "Ana", 1500, 200);
        ContaBancaria ciar = new ContaInvestimentoAltoRisco(654, "Pedro", 12000);

        cc.sacar(1200);
        cp.sacar(2500);
        ci.sacar(1000);
        cs.sacar(500);
        cs.sacar(500);
        ciar.sacar(2000);

        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        ciar.exibirInformacoes();
    }
}
