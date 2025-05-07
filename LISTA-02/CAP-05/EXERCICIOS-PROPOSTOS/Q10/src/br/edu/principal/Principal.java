package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                somaPares += num;
            }

            if (num > 1) {
                boolean primo = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    somaPrimos += num;
                }
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);
    }
}
