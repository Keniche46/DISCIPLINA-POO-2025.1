package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String gabarito_respostas[] = new String[8], respostas_alunos[] = new String[8]; 
        int numero_aluno, pontos_obtidos, total_aprovados = 0, percentual_aprovacao, i, j;
        Scanner scanner = new Scanner(System.in);
        
        for (i = 0; i < 8; i++) {
            System.out.println("Digite a resposta da questão " + (i + 1) + ":");
            gabarito_respostas[i] = scanner.next();
        }

        for (i = 0; i < 10; i++) {
            System.out.println("Digite o número do " + (i + 1) + "º aluno:");
            numero_aluno = scanner.nextInt();
            pontos_obtidos = 0;
            for (j = 0; j < 8; j++) {
                System.out.println("Digite a resposta dada pelo aluno " + numero_aluno + " à " + (j + 1) + "ª questão:");
                respostas_alunos[j] = scanner.next();
                if (respostas_alunos[j].equals(gabarito_respostas[j])) {
                    pontos_obtidos = pontos_obtidos + 1;
                }
            }
            System.out.println("A nota do aluno " + numero_aluno + " foi: " + pontos_obtidos);
            if (pontos_obtidos >= 6) {
                total_aprovados = total_aprovados + 1;
            }
        }
        
        percentual_aprovacao = total_aprovados * 100 / 10;
        System.out.println("O percentual de alunos aprovados é: " + percentual_aprovacao + "%");
    }
}
