package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int i, j, aux;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite o número da posição " + (i + 1) + ":");
            vetor[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}
