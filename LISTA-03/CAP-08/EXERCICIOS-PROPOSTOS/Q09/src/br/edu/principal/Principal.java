package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro e positivo: ");
	        int n = scanner.nextInt();
	        
	        try {
	            long resultado = somaDivisores(n);
	            System.out.println("Soma dos divisores de " + n + ": " + resultado);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        scanner.close();
	    }

	    public static long somaDivisores(int n) {
	        if (n <= 0) {
	            throw new IllegalArgumentException("O número deve ser positivo.");
	        }
	        
	        long soma = 0;
	        for (int i = 1; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                soma += i; 
	                if (i != n / i) { 
	                    soma += n / i; 
	                }
	            }
	        }
	        return soma;
	    }
}
