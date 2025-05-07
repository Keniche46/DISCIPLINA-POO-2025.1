package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número positivo: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número positivo: ");
        int b = scanner.nextInt();
        
        try {
            long resultado = somaEntreNumeros(a, b);
            System.out.println("Soma dos números inteiros entre " + a + " e " + b + ": " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static long somaEntreNumeros(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Os números devem ser positivos.");
        }
        
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);
        int primeiro = menor + 1;
        int ultimo = maior - 1;
        
        if (primeiro > ultimo) {
            return 0;
        }
        
        int n = ultimo - primeiro + 1;
        return (long) n * (primeiro + ultimo) / 2;
    }
}
