package br.edu.principal;

public class Principal {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Digite horas: ");
		int horas = scanner.nextInt();
		System.out.print("Digite minutos: ");
		int minutos = scanner.nextInt();
		System.out.print("Digite segundos: ");
		int segundos = scanner.nextInt();

		long resultado = converterParaSegundos(horas, minutos, segundos);
		System.out.println("Total em segundos: " + resultado);

		scanner.close();
		}

		public static long converterParaSegundos(int horas, int minutos, int segundos) {
		return horas * 3600L + minutos * 60L + segundos;
		}
}
