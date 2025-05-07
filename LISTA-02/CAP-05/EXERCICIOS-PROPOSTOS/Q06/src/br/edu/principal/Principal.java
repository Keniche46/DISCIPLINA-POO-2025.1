package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalVista = 0;
        double totalPrazo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o código da transação " + i + " (V para à vista, P para a prazo): ");
            String cod = sc.next().toUpperCase();

            System.out.print("Digite o valor da transação " + i + ": ");
            double valor = sc.nextDouble();

            if (cod.equals("V")) {
                totalVista += valor;
            } else if (cod.equals("P")) {
                totalPrazo += valor;
            }
        }

        double totalGeral = totalVista + totalPrazo;
        double primeiraParcelaPrazo = totalPrazo / 3;

        System.out.println("\nTotal das compras à vista: R$ " + String.format("%.2f", totalVista));
        System.out.println("Total das compras a prazo: R$ " + String.format("%.2f", totalPrazo));
        System.out.println("Total das compras efetuadas: R$ " + String.format("%.2f", totalGeral));
        System.out.println("Valor da primeira prestação das compras a prazo: R$ " + String.format("%.2f", primeiraParcelaPrazo));
    }
}
