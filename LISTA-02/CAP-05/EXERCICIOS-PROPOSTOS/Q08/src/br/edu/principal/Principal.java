package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contIdadePeso = 0;
        int contAlturaBaixa = 0;
        int somaIdadesAlturaBaixa = 0;
        int contOlhosAzuis = 0;
        int contRuivosNaoAzuis = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            System.out.print("Peso da pessoa " + i + ": ");
            double peso = sc.nextDouble();

            System.out.print("Altura da pessoa " + i + ": ");
            double altura = sc.nextDouble();

            System.out.print("Cor dos olhos (A - azul, P - preto, V - verde, C - castanho): ");
            String olhos = sc.next().toUpperCase();

            System.out.print("Cor dos cabelos (P - preto, C - castanho, L - louro, R - ruivo): ");
            String cabelos = sc.next().toUpperCase();

            if (idade > 50 && peso < 60) {
                contIdadePeso++;
            }

            if (altura < 1.5) {
                somaIdadesAlturaBaixa += idade;
                contAlturaBaixa++;
            }

            if (olhos.equals("A")) {
                contOlhosAzuis++;
            }

            if (cabelos.equals("R") && !olhos.equals("A")) {
                contRuivosNaoAzuis++;
            }
        }

        double mediaIdadeAlturaBaixa = contAlturaBaixa > 0 ? (double) somaIdadesAlturaBaixa / contAlturaBaixa : 0;
        double porcentagemOlhosAzuis = (contOlhosAzuis * 100.0) / 6;

        System.out.println("\nQuantidade de pessoas com mais de 50 anos e peso inferior a 60 kg: " + contIdadePeso);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + String.format("%.2f", mediaIdadeAlturaBaixa));
        System.out.println("Porcentagem de pessoas com olhos azuis: " + String.format("%.2f", porcentagemOlhosAzuis) + "%");
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + contRuivosNaoAzuis);
    }
}
