package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = sc.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        int total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;

        System.out.println("\nQuantidade de pessoas por faixa etária:");
        System.out.println("1ª faixa (até 15 anos): " + faixa1);
        System.out.println("2ª faixa (16 a 30 anos): " + faixa2);
        System.out.println("3ª faixa (31 a 45 anos): " + faixa3);
        System.out.println("4ª faixa (46 a 60 anos): " + faixa4);
        System.out.println("5ª faixa (acima de 60 anos): " + faixa5);

        double porcentFaixa1 = (faixa1 * 100.0) / total;
        double porcentFaixa5 = (faixa5 * 100.0) / total;

        System.out.printf("\nPorcentagem na 1ª faixa: %.2f%%\n", porcentFaixa1);
        System.out.printf("Porcentagem na 5ª faixa: %.2f%%\n", porcentFaixa5);
    }
}
