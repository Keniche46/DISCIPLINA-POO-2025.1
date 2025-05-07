package br.edu.principal;

public class Principal {
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número (n1): ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número (n2): ");
        int n2 = scanner.nextInt();
        
        try {
            int resultado = encontrarDivisor(n1, n2);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static int encontrarDivisor(int n1, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("O segundo número não pode ser zero.");
        }
        
        if (n1 % n2 == 0) {
            return 0;
        }
        
        int absN1 = Math.abs(n1);
        for (int i = Math.abs(n2) + 1; i <= absN1; i++) {
            if (n1 % i == 0) {
                return i;
            }
        }
        
        return Math.abs(n1);
    }
}
