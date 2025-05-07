package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de a (maior que 1): ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();
        
        try {
            long resultado = somaDivisiveisPorA(a, b, c);
            System.out.println("Soma dos números divisíveis por " + a + " entre " + b + " e " + c + ": " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static long somaDivisiveisPorA(int a, int b, int c) {
        if (a <= 1) {
            throw new IllegalArgumentException("O valor de a deve ser maior que 1.");
        }
        
        int inicio = Math.min(b, c);
        int fim = Math.max(b, c);
        long soma = 0;
        
        for (int i = inicio; i <= fim; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        
        return soma;
    }
}
