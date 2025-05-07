package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, salarioReajustado;

        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextDouble();

        if (salario <= 300) {
            salarioReajustado = salario + (salario * 0.35);
            System.out.println("Salário reajustado: R$ " + salarioReajustado);
        } else {
            salarioReajustado = salario + (salario * 0.15);
            System.out.println("Salário reajustado: R$ " + salarioReajustado);
        }
    }
}
