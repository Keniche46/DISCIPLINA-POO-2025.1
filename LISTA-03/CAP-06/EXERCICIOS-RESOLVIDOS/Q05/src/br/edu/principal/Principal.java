package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double vetor_x[] = new double[10], vetor_y[] = new double[10];
        double vetor_uniao[] = new double[20], vetor_diferenca[] = new double[10];
        double vetor_soma[] = new double[10], vetor_produto[] = new double[10];
        double vetor_intersecao[] = new double[10];

        int qtd_uniao = 0, qtd_diferenca = 0, qtd_intersecao = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número para X:");
            vetor_x[i] = sc.nextDouble();
            System.out.println("Digite um número para Y:");
            vetor_y[i] = sc.nextDouble();
        }

        
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < qtd_uniao && vetor_x[i] != vetor_uniao[j]) {
                j++;
            }
            if (j >= qtd_uniao) {
                vetor_uniao[qtd_uniao] = vetor_x[i];
                qtd_uniao++;
            }
        }
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < qtd_uniao && vetor_y[i] != vetor_uniao[j]) {
                j++;
            }
            if (j >= qtd_uniao) {
                vetor_uniao[qtd_uniao] = vetor_y[i];
                qtd_uniao++;
            }
        }

        System.out.println("União:");
        for (int i = 0; i < qtd_uniao; i++) {
            System.out.println(vetor_uniao[i]);
        }

        
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10 && vetor_x[i] != vetor_y[j]) {
                j++;
            }
            if (j >= 10) {
                int k = 0;
                while (k < qtd_diferenca && vetor_x[i] != vetor_diferenca[k]) {
                    k++;
                }
                if (k >= qtd_diferenca) {
                    vetor_diferenca[qtd_diferenca] = vetor_x[i];
                    qtd_diferenca++;
                }
            }
        }

        System.out.println("Diferença (X - Y):");
        for (int i = 0; i < qtd_diferenca; i++) {
            System.out.println(vetor_diferenca[i]);
        }

        
        System.out.println("Soma:");
        for (int i = 0; i < 10; i++) {
            vetor_soma[i] = vetor_x[i] + vetor_y[i];
            System.out.println(vetor_soma[i]);
        }

        
        System.out.println("Produto:");
        for (int i = 0; i < 10; i++) {
            vetor_produto[i] = vetor_x[i] * vetor_y[i];
            System.out.println(vetor_produto[i]);
        }

        
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10 && vetor_x[i] != vetor_y[j]) {
                j++;
            }
            if (j < 10) {
                int k = 0;
                while (k < qtd_intersecao && vetor_intersecao[k] != vetor_x[i]) {
                    k++;
                }
                if (k >= qtd_intersecao) {
                    vetor_intersecao[qtd_intersecao] = vetor_x[i];
                    qtd_intersecao++;
                }
            }
        }

        System.out.println("Interseção:");
        for (int i = 0; i < qtd_intersecao; i++) {
            System.out.println(vetor_intersecao[i]);
        }

        
    }
}
