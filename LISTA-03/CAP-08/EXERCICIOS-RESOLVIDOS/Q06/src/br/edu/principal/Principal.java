package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro (1 a 9): ");
        int n = scanner.nextInt();
        
        try {
            mostrarTabelaMultiplicacao(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static void mostrarTabelaMultiplicacao(int n) {
        if (n < 1 || n > 9) {
            throw new IllegalArgumentException("O número deve estar entre 1 e 9.");
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
