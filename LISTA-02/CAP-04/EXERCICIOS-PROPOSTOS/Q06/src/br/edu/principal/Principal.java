package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("\nEscolha uma opção:");
        System.out.println("a) O primeiro número elevado ao segundo número");
        System.out.println("b) Raiz quadrada de cada um dos números");
        System.out.println("c) Raiz cúbica de cada um dos números");
        System.out.print("Opção: ");
        char opcao = sc.next().charAt(0);

        switch (opcao) {
            case 'a':
                resultado = Math.pow(num1, num2);
                System.out.println(num1 + " elevado a " + num2 + " é: " + resultado);
                break;

            case 'b':
                if (num1 >= 0 && num2 >= 0) {
                    System.out.println("Raiz quadrada de " + num1 + " é: " + Math.sqrt(num1));
                    System.out.println("Raiz quadrada de " + num2 + " é: " + Math.sqrt(num2));
                } else {
                    System.out.println("Erro: Não é possível calcular a raiz quadrada de números negativos.");
                }
                break;

            case 'c':
                System.out.println("Raiz cúbica de " + num1 + " é: " + Math.cbrt(num1));
                System.out.println("Raiz cúbica de " + num2 + " é: " + Math.cbrt(num2));
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
