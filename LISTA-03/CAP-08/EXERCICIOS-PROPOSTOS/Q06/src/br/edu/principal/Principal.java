package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        try {
            double pesoIdeal = calcularPesoIdeal(altura, sexo);
            System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static double calcularPesoIdeal(double alt, char sexo) {
        if (alt <= 0) {
            throw new IllegalArgumentException("A altura deve ser positiva.");
        }
        if (sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo inválido. Use 'M' ou 'F'.");
        }

        if (sexo == 'M') {
            return 72.7 * alt - 58;
        } else {
            return 62.1 * alt - 44.7;
        }
    }
}
