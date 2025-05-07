package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contMais50 = 0;
        int contAlturaEntre10e20 = 0;
        double somaAlturas = 0;
        int contPesoMenor40 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura (em metros) da pessoa " + i + ": ");
            double altura = sc.nextDouble();

            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = sc.nextDouble();

            if (idade > 50) {
                contMais50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contAlturaEntre10e20++;
            }

            if (peso < 40) {
                contPesoMenor40++;
            }
        }

        double mediaAlturas = contAlturaEntre10e20 > 0 ? somaAlturas / contAlturaEntre10e20 : 0;
        double porcentagemPesoMenor40 = (contPesoMenor40 * 100.0) / 5;

        System.out.println("\nQuantidade de pessoas com mais de 50 anos: " + contMais50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + String.format("%.2f", mediaAlturas));
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + String.format("%.2f", porcentagemPesoMenor40) + "%");
    }
}
