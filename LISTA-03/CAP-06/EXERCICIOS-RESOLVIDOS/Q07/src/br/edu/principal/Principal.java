package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int[] vet = new int[8];
        int aux, j, z;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número:");
            aux = sc.nextInt();

            j = 0;
            while (j < i && vet[j] < aux) {
                j++;
            }

            z = i;
            while (z >= j + 1) {
                vet[z] = vet[z - 1];
                z--;
            }

            vet[j] = aux;
        }

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 8; i++) {
            System.out.println(vet[i]);
        }

    }
}
