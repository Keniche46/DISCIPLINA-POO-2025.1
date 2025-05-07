package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("O número maior é: " + num1);
		} else if (num2 > num1) {
			System.out.println("O número maior é: " + num2);
		} else {
			System.out.println("O número " + num1 + " e " + num2 + " são iguais");
		}
	}
}
