package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");
        System.out.print("Opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = (num1 + num2) / 2;
                System.out.println("A média é: " + resultado);
                break;
            case 2:
                if (num1 > num2) {
                    resultado = num1 - num2;
                } else {
                    resultado = num2 - num1;
                }
                System.out.println("A diferença do maior pelo menor é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O produto é: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("A divisão é: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
