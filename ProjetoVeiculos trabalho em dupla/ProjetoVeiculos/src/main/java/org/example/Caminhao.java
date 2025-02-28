package org.example;

public class Caminhao extends Veiculo {
    protected double capacidadeCarga;
    protected final double tanque = 300;
    protected final double consumoBase = 6;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao = Math.min(capacidadeCarga * 0.01, 0.25);
        double consumoAjustado = consumoBase * (1 - reducao);
        return tanque * consumoAjustado;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }
}
