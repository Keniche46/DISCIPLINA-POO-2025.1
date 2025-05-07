package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, r;
		System.out.print("Digite o número: ");
		num = sc.nextInt();
		
		r = num % 2;
		
		if (r == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
	}
}
