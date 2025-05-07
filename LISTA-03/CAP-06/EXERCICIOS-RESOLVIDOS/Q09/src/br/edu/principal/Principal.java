package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int[] voo = new int[12];
        int[] lugares = new int[12];
        String[] origem = new String[12];
        String[] destino = new String[12];
        int i, op, op2, num_voo;
        String local;
        
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 12; i++) {
            System.out.print("Digite o número do voo: ");
            voo[i] = sc.nextInt();
            System.out.print("Digite o local de origem: ");
            origem[i] = sc.next();
            System.out.print("Digite o local de destino: ");
            destino[i] = sc.next();
            System.out.print("Digite o número de lugares disponíveis: ");
            lugares[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("1 - Consultar");
            System.out.println("2 - Reservar");
            System.out.println("3 - Finalizar");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("1 - Consultar por voo");
                System.out.println("2 - Consultar por origem");
                System.out.println("3 - Consultar por destino");
                System.out.print("Escolha uma opção: ");
                op2 = sc.nextInt();

                if (op2 == 1) {
                    System.out.print("Digite o número do voo: ");
                    num_voo = sc.nextInt();
                    i = 0;
                    while (i < 12 && voo[i] != num_voo) {
                        i++;
                    }
                    if (i >= 12) {
                        System.out.println("Voo inexistente.");
                    } else {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Origem: " + origem[i]);
                        System.out.println("Destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }

                if (op2 == 2) {
                    System.out.print("Digite o local de origem: ");
                    local = sc.next();
                    for (i = 0; i < 12; i++) {
                        if (origem[i].equals(local)) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }

                if (op2 == 3) {
                    System.out.print("Digite o local de destino: ");
                    local = sc.next();
                    for (i = 0; i < 12; i++) {
                        if (destino[i].equals(local)) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Origem: " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }

            } else if (op == 2) {
                System.out.print("Digite o número do voo desejado para reserva: ");
                num_voo = sc.nextInt();
                i = 0;
                while (i < 12 && voo[i] != num_voo) {
                    i++;
                }
                if (i >= 12) {
                    System.out.println("Número do voo não encontrado.");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado.");
                    } else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada! Lugares restantes: " + lugares[i]);
                    }
                }

            } else if (op == 3) {
                System.out.println("Programa finalizado.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

       
    }
}
