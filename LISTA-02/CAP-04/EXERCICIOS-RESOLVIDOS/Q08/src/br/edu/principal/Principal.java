package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, raiz;
		int op;
		
		System.out.println("===MENU===");
		System.out.println("1- Somar dois números.");
		System.out.println("2- Raiz quadrada de um número.");
		System.out.print("Digite sua opção: ");
		op = sc.nextInt();
		
		switch (op) {
			case 1:
				System.out.print("Digite o primeiro número: ");
				num1 = sc.nextDouble();
				
				System.out.print("Digite o segundo número: ");
				num2 = sc.nextDouble();
				
				soma = num1 + num2;
				
				System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
				break;
			
			case 2:
				System.out.print("Digite um valor: ");
				num1 = sc.nextDouble();
				
				raiz = Math.sqrt(num1);
				System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
				break;
			
			default:
				System.out.println("Opção inválida!");
		}
	}
}