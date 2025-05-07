package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int resultado = verificaPositivo(numero);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }

    public static int verificaPositivo(int n) {
        return n > 0 ? 1 : 0;
    }
}

