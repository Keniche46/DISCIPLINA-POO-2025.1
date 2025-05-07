package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o raio da esfera (m): ");
	        double raio = scanner.nextDouble();
	        
	        if (raio >= 0) {
	            double volume = calcularVolumeEsfera(raio);
	            System.out.printf("Volume da esfera: %.2f m³\n", volume);
	        } else {
	            System.out.println("O raio deve ser não negativo.");
	        }
	        
	        scanner.close();
	    }

	    public static double calcularVolumeEsfera(double raio) {
	        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
	    }
}
