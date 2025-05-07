package br.edu.principal;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o total de segundos: ");
	        int segundosTotais = scanner.nextInt();
	        
	        int[] tempo = new int[3]; // Array para armazenar horas, minutos, segundos
	        try {
	            converterSegundos(segundosTotais, tempo);
	            System.out.printf("Tempo: %d horas, %d minutos, %d segundos\n", 
	                             tempo[0], tempo[1], tempo[2]);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        scanner.close();
	    }

	    public static void converterSegundos(int segundosTotais, int[] tempo) {
	        if (segundosTotais < 0) {
	            throw new IllegalArgumentException("O valor de segundos deve ser não negativo.");
	        }
	        
	        tempo[0] = segundosTotais / 3600; 
	        tempo[1] = (segundosTotais % 3600) / 60; 
	        tempo[2] = segundosTotais % 60; 
	    }
}
