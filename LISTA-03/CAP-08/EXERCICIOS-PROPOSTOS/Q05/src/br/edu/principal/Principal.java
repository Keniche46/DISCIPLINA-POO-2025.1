package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        String resultado = verificarPositivoNegativo(numero);
        System.out.println("O número é: " + resultado);
        
        scanner.close();
    }

    public static String verificarPositivoNegativo(int n) {
        if (n > 0) {
            return "Positivo";
        } else if (n < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
    }
}
