package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro e positivo para N: ");
        int n = scanner.nextInt();
        
        try {
            double resultado = calcularS(n);
            System.out.printf("S = %.6f%n", resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
    
    public static double calcularS(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N deve ser um número inteiro positivo");
        }
        
        double s = 1.0; 
        
        for (int i = 1; i <= n; i++) {
            s += 1.0 / calcularFatorial(i);
        }
        
        return s;
    }
    
 
    private static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
