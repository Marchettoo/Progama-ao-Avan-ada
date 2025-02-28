package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        System.out.println("Carro ");
        carro.exibirDetalhes();

        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021, 2, "Diesel", 5);
        System.out.println("\nCaminhão");
        caminhao.exibirDetalhes();

        try {
            Onibus onibus = new Onibus("Mercedes", "O500", 2020, 50, "Diesel", 7);
            System.out.println("\n Ônibus ");
            onibus.exibirDetalhes();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, 5, "Elétrico", "Sedan", 75);
        System.out.println("\n Carro Elétrico ");
        carroEletrico.exibirDetalhes();

        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R-Series", 2022, 2, "Diesel", 10, -5);
        System.out.println("\n Caminhão Refrigerado ");
        caminhaoRefrigerado.exibirDetalhes();
    }
}
