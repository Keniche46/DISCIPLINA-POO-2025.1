package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, num;
        long fat;

        System.out.print("Digite a quantidade de números: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um número para calcular o fatorial: ");
            num = sc.nextInt();
            fat = 1;

            for (int j = 1; j <= num; j++) {
                fat *= j;
            }

            System.out.println("O fatorial de " + num + " é: " + fat);
        }
    }
}
