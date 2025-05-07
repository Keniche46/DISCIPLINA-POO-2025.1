package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor antigo do produto: R$ ");
        double valorAntigo = scanner.nextDouble();
        System.out.print("Digite o valor atual do produto: R$ ");
        double valorAtual = scanner.nextDouble();
        
        try {
            double percentual = calcularPercentualAcrescimo(valorAntigo, valorAtual);
            System.out.printf("Percentual de acréscimo: %.2f%%\n", percentual);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static double calcularPercentualAcrescimo(double valorAntigo, double valorAtual) {
        if (valorAntigo <= 0) {
            throw new IllegalArgumentException("O valor antigo deve ser maior que zero.");
        }
        if (valorAntigo < 0 || valorAtual < 0) {
            throw new IllegalArgumentException("Os valores não podem ser negativos.");
        }
        
        double diferenca = valorAtual - valorAntigo;
        return (diferenca / valorAntigo) * 100;
    }
}
