package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro e positivo: ");
	        int n = scanner.nextInt();
	        
	        try {
	            long resultado = calcularFatorial(n);
	            System.out.println("Fatorial de " + n + ": " + resultado);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        scanner.close();
	    }

	    public static long calcularFatorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("O número deve ser não negativo.");
	        }
	        if (n > 20) {
	            throw new IllegalArgumentException("Número muito grande para calcular o fatorial (overflow).");
	        }
	        
	        if (n == 0) {
	            return 1;
	        }
	        
	        long fatorial = 1;
	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }
}
