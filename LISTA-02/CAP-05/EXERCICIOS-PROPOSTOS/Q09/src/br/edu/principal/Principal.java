package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contPesoAltura = 0;
        int contIdadeEntre10e30AlturaAlta = 0;
        int contAlturaAlta = 0;
        int somaIdades = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = sc.nextDouble();

            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = sc.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                contPesoAltura++;
            }

            if (altura > 1.90) {
                contAlturaAlta++;
                if (idade >= 10 && idade <= 30) {
                    contIdadeEntre10e30AlturaAlta++;
                }
            }
        }

        double mediaIdades = somaIdades / 10.0;
        double porcentagemIdadeEntre10e30 = contAlturaAlta > 0 ? (contIdadeEntre10e30AlturaAlta * 100.0) / contAlturaAlta : 0;

        System.out.println("\nMédia das idades das dez pessoas: " + String.format("%.2f", mediaIdades));
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50m: " + contPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e altura superior a 1,90m: " + String.format("%.2f", porcentagemIdadeEntre10e30) + "%");
    }
}
