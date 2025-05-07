package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o tipo de média (A/P): ");
        char tipo = scanner.next().toUpperCase().charAt(0);
        
        try {
            double media = calcularMedia(nota1, nota2, nota3, tipo);
            System.out.printf("Média: %.2f\n", media);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, char tipo) {
        if (tipo != 'A' && tipo != 'P') {
            throw new IllegalArgumentException("Tipo de média inválido. Use 'A' ou 'P'.");
        }
        
        if (tipo == 'A') {
            return (nota1 + nota2 + nota3) / 3;
        } else {
            return (5 * nota1 + 3 * nota2 + 2 * nota3) / 10;
        }
    }
}
