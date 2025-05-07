package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        double media = calcularMediaValores();
        if (Double.isNaN(media)) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.printf("Média dos valores positivos: %.2f\n", media);
        }
    }

    public static double calcularMediaValores() {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contagem = 0;

        while (true) {
            System.out.print("Digite um valor (0 para encerrar): ");
            double valor = scanner.nextDouble();
            
            if (valor == 0) {
                break;
            }
            if (valor > 0) {
                soma += valor;
                contagem++;
            }
        }

        if (contagem == 0) {
            return Double.NaN; 
        }
        return soma / contagem;
    }
}
