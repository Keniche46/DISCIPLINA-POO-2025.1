package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual;
        double salario = 1000, novoSalario, percentual = 1.5 / 100;

        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        novoSalario = salario + percentual * salario;

        for (int i = 2007; i <= anoAtual; i++) {
            percentual = 2 * percentual;
            novoSalario = novoSalario + percentual * novoSalario;
        }

        System.out.println("O novo salário é: " + novoSalario);
    }
}