package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida!");
        }
    }
}