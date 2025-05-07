package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double custoFabrica, precoConsumidor;

        System.out.print("Digite o custo de fábrica do carro: ");
        custoFabrica = sc.nextDouble();

        if (custoFabrica <= 12000) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.05);
        } else if (custoFabrica <= 25000) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.10) + (custoFabrica * 0.15);
        } else {
            precoConsumidor = custoFabrica + (custoFabrica * 0.15) + (custoFabrica * 0.20);
        }

        System.out.println("Preço ao consumidor: R$ " + precoConsumidor);
    }
}
