package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double[] vetor_x = new double[5], vetor_y = new double[5], vetor_r = new double[10];
        int i, j;
        double aux;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.print("Digite um número para a posição " + i + " de X: ");
            vetor_x[i] = sc.nextDouble();
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) {
                if (vetor_x[j] > vetor_x[j + 1]) {
                    aux = vetor_x[j];
                    vetor_x[j] = vetor_x[j + 1];
                    vetor_x[j + 1] = aux;
                }
            }
        }

        for (i = 0; i < 5; i++) {
            System.out.print("Digite um número para a posição " + i + " de Y: ");
            vetor_y[i] = sc.nextDouble();
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) {
                if (vetor_y[j] > vetor_y[j + 1]) {
                    aux = vetor_y[j];
                    vetor_y[j] = vetor_y[j + 1];
                    vetor_y[j + 1] = aux;
                }
            }
        }

        j = 0;
        for (i = 0; i < 5; i++) {
            vetor_r[j] = vetor_x[i];
            j++;
            vetor_r[j] = vetor_y[i];
            j++;
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (vetor_r[j] > vetor_r[j + 1]) {
                    aux = vetor_r[j];
                    vetor_r[j] = vetor_r[j + 1];
                    vetor_r[j + 1] = aux;
                }
            }
        }

        System.out.print("Vetor X ordenado: ");
        for (i = 0; i < 5; i++) {
            System.out.print(vetor_x[i] + " ");
        }

        System.out.print("\nVetor Y ordenado: ");
        for (i = 0; i < 5; i++) {
            System.out.print(vetor_y[i] + " ");
        }

        System.out.print("\nVetor R (junção ordenada de X e Y): ");
        for (i = 0; i < 10; i++) {
            System.out.print(vetor_r[i] + " ");
        }

        
    }
}
