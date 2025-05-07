package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, maior;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
