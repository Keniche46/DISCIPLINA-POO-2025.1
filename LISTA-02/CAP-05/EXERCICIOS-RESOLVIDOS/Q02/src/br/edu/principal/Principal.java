package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double e = 1;

        System.out.print("Digite um valor N inteiro e positivo: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1 / fat;
        }

        System.out.println("O valor de E é: " + e);
    }
}