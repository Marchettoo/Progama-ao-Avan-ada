package org.example;

public class Carro extends Veiculo {
    private String tipoCarro;
    private final double tanque = 50;
    private final double consumo = 12;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return tanque * consumo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Carro: " + tipoCarro);
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }
}