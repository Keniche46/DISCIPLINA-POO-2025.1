package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}