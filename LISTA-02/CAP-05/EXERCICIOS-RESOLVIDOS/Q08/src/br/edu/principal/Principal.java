package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 4, num_termos;
        int num1 = 2, num2 = 7, num3 = 3;

        num_termos = sc.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        while (i <= num_termos) {
            num1 *= 2;
            System.out.println(num1);
            i++;
            if (i <= num_termos) {
                num2 *= 3;
                System.out.println(num2);
                i++;
                if (i <= num_termos) {
                    num3 *= 4;
                    System.out.println(num3);
                    i++;
                }
            }
        }
    }
}
