package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] vetor1 = new double[10];
        double[] vetor2 = new double[10];
        double[] vetor3 = new double[20];
        int j = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número da posição " + (i + 1) + " do vetor 1");
            vetor1[i] = sc.nextDouble();
            vetor3[j++] = vetor1[i];

            System.out.println("Digite o número da posição " + (i + 1) + " do vetor 2");
            vetor2[i] = sc.nextDouble();
            vetor3[j++] = vetor2[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(vetor3[i] + " ");
        }
    }
}
