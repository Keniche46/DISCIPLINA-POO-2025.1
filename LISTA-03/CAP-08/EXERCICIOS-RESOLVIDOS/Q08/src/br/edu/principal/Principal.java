package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora de início (0-23): ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite os minutos de início (0-59): ");
        int minutoInicio = scanner.nextInt();
        System.out.print("Digite a hora de término (0-23): ");
        int horaTermino = scanner.nextInt();
        System.out.print("Digite os minutos de término (0-59): ");
        int minutoTermino = scanner.nextInt();
        
        try {
            int duracao = calcularDuracaoJogo(horaInicio, minutoInicio, horaTermino, minutoTermino);
            System.out.println("Duração do jogo: " + duracao + " minutos");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static int calcularDuracaoJogo(int horaInicio, int minutoInicio, int horaTermino, int minutoTermino) {
        if (horaInicio < 0 || horaInicio >= 24 || horaTermino < 0 || horaTermino >= 24) {
            throw new IllegalArgumentException("As horas devem estar entre 0 e 23.");
        }
        if (minutoInicio < 0 || minutoInicio >= 60 || minutoTermino < 0 || minutoTermino >= 60) {
            throw new IllegalArgumentException("Os minutos devem estar entre 0 e 59.");
        }
        
        int minutosInicio = horaInicio * 60 + minutoInicio;
        int minutosTermino = horaTermino * 60 + minutoTermino;
        int duracao;
        
        if (minutosTermino >= minutosInicio) {
            duracao = minutosTermino - minutosInicio;
        } else {
            duracao = minutosTermino - minutosInicio + 24 * 60;
        }
        
        if (duracao > 24 * 60) {
            throw new IllegalArgumentException("A duração não pode exceder 24 horas.");
        }
        
        return duracao;
    }
}
