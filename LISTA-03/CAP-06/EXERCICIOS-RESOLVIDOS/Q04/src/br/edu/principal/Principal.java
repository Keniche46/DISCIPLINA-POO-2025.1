package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int cont_n = 0, cont_p = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número inteiro: ");
            num[i] = sc.nextInt();

            if (num[i] >= 0) {
                pos[cont_p] = num[i];
                cont_p++;
            } else {
                neg[cont_n] = num[i];
                cont_n++;
            }
        }

        if (cont_n == 0) {
            System.out.println("Vetor de negativos vazio.");
        } else {
            System.out.println("Números negativos:");
            for (int i = 0; i < cont_n; i++) {
                System.out.println(neg[i]);
            }
        }

        if (cont_p == 0) {
            System.out.println("Vetor de positivos vazio.");
        } else {
            System.out.println("Números positivos:");
            for (int i = 0; i < cont_p; i++) {
                System.out.println(pos[i]);
            }
        }
    }
}
