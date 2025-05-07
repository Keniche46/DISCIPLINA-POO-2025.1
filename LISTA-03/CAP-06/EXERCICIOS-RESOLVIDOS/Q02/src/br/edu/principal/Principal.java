package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] qtd = new double[10];
        double[] preco = new double[10];
        int tot_geral = 0, tot_vend, comissao, maior, ind;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a quantidade vendida do produto " + (i+1) + ":");
            qtd[i] = sc.nextDouble();
            System.out.println("Digite o preço do produto " + (i+1) + ":");
            preco[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < 10; i++) {
            tot_vend = (int) (qtd[i] * preco[i]);
            System.out.println("Quantidade do Produto " + (i+1) + ": " + qtd[i] + " | Valor: " + preco[i] + " | Total: " + tot_vend);
            tot_geral += tot_vend;
        }
        
        comissao = (int) (tot_geral * 0.05);
        System.out.println("Total geral: " + tot_geral + " | Comissão gerada: " + comissao);
        
        maior = (int) qtd[0];
        ind = 0;
        
        for (int i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = (int) qtd[i];
                ind = i;
            }
        }
        
        System.out.println("Produto mais vendido: Produto " + (ind+1) + " | Posição: " + (ind+1) + " | Quantidade: " + maior);
    }
}
