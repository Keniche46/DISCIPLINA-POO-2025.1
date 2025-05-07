package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, codigo, nht;
        double sal_min = 450, valor = 0, sal_inicial, aux = 0, sal_final;
        String turno, categoria;

        for (cont = 1; cont <= 10; cont++) {
            System.out.print("Digite o código do funcionário: ");
            codigo = sc.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            nht = sc.nextInt();

            sc.nextLine();

            System.out.print("Digite o turno (M - manhã, V - vespertino, N - noturno): ");
            turno = sc.nextLine().toUpperCase();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.print("Turno inválido. Digite novamente (M/V/N): ");
                turno = sc.nextLine().toUpperCase();
            }

            System.out.print("Digite a categoria (G - gerente, O - operário): ");
            categoria = sc.nextLine().toUpperCase();

            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.print("Categoria inválida. Digite novamente (G/O): ");
                categoria = sc.nextLine().toUpperCase();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = sal_min * 0.18;
                } else {
                    valor = sal_min * 0.15;
                }
            } else {
                if (turno.equals("N")) {
                    valor = sal_min * 0.13;
                } else {
                    valor = sal_min * 0.10;
                }
            }

            sal_inicial = nht * valor;

            if (sal_inicial <= 300) {
                aux = sal_inicial * 0.20;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 0.15;
            } else {
                aux = sal_inicial * 0.05;
            }

            sal_final = sal_inicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("Horas trabalhadas: " + nht);
            System.out.println("Valor hora: " + valor);
            System.out.println("Salário inicial: " + sal_inicial);
            System.out.println("Auxílio: " + aux);
            System.out.println("Salário final: " + sal_final);
            System.out.println();
        }
    }
}
