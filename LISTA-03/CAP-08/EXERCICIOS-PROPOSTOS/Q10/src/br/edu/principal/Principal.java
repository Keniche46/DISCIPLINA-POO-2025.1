package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro (N ≥ 1): ");
        int n = scanner.nextInt();
        
        try {
            double resultado = calcularSerieHarmonica(n);
            System.out.printf("Valor da sequência S: %.6f\n", resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static double calcularSerieHarmonica(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 1.");
        }
        
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        return soma;
    }
}
