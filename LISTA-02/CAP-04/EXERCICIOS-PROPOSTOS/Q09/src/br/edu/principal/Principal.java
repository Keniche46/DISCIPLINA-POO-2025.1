package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoMedio, credito;

        System.out.print("Digite o saldo médio do cliente: ");
        saldoMedio = sc.nextDouble();

        if (saldoMedio > 400) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio >= 300) {
            credito = saldoMedio * 0.25;
        } else if (saldoMedio >= 200) {
            credito = saldoMedio * 0.20;
        } else {
            credito = saldoMedio * 0.10;
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito: R$ " + credito);
    }
}
