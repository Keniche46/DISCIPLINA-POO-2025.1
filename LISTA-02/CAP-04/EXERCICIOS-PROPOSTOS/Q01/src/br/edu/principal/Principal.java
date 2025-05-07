package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
