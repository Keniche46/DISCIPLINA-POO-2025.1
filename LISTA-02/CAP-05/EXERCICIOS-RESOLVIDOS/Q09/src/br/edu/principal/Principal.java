package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, media, media_classe = 0, total_classe = 0;
        int ta = 0, te = 0, tr = 0;

        for (int cont = 1; cont <= 6; cont++) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            media = (n1 + n2) / 2;
            System.out.println(media);
            if (media <= 3) {
                tr += 1;
                System.out.println("Reprovado");
            }
            if (media > 3 && media < 7) {
                te += 1;
                System.out.println("Exame");
            }
            if (media >= 7) {
                ta += 1;
                System.out.println("Aprovado");
            }
            total_classe += media;
        }

        System.out.println(tr);
        System.out.println(te);
        System.out.println(ta);
        media_classe = total_classe / 6;
        System.out.println(media_classe);
    }
}
