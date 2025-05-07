package br.edu.principal;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grupos = new int[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os 4 valores para o grupo " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                grupos[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOrdem original dos grupos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Grupo " + (i + 1) + ": " + Arrays.toString(grupos[i]));
        }

        System.out.println("\nGrupos em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            Arrays.sort(grupos[i]);
            System.out.println("Grupo " + (i + 1) + ": " + Arrays.toString(grupos[i]));
        }

        System.out.println("\nGrupos em ordem decrescente:");
        for (int i = 0; i < 5; i++) {
            Arrays.sort(grupos[i]);
            for (int j = 0; j < 2; j++) {
                int temp = grupos[i][j];
                grupos[i][j] = grupos[i][3 - j];
                grupos[i][3 - j] = temp;
            }
            System.out.println("Grupo " + (i + 1) + ": " + Arrays.toString(grupos[i]));
        }
    }
}
