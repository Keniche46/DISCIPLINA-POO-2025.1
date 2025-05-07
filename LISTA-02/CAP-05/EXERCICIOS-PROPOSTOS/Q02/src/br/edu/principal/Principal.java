package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double preco = 5.0;
        int ingressos = 120;
        double despesas = 200.0;

        double lucroMax = 0.0;
        double precoLucroMax = 0.0;
        int qtdLucroMax = 0;

        System.out.println("Preço\tQtd Ingressos\tLucro");
        
        while (preco >= 1.0) {
            int qtd = ingressos + (int)(((5.0 - preco) / 0.5) * 26);
            double lucro = (preco * qtd) - despesas;

            System.out.printf("R$ %.2f\t%d\t\tR$ %.2f\n", preco, qtd, lucro);

            if (lucro > lucroMax) {
                lucroMax = lucro;
                precoLucroMax = preco;
                qtdLucroMax = qtd;
            }

            preco -= 0.5;
        }

        System.out.println("\nLucro máximo esperado: R$ " + String.format("%.2f", lucroMax));
        System.out.println("Preço do ingresso para lucro máximo: R$ " + String.format("%.2f", precoLucroMax));
        System.out.println("Quantidade de ingressos vendidos: " + qtdLucroMax);
    }
}
