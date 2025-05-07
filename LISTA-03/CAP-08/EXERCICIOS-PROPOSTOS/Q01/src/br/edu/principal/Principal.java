package br.edu.principal;

public class Principal {
	public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro e positivo: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            long resultado = somaAteN(n);
            System.out.println("Soma dos números de 1 a " + n + ": " + resultado);
        } else {
            System.out.println("O número deve ser positivo.");
        }
        
        scanner.close();
    }

    public static long somaAteN(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O número deve ser positivo.");
        }
        return (long) n * (n + 1) / 2;
    	}
    }
