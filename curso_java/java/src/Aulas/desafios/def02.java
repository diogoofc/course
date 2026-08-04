package Aulas.desafios;

import java.util.Locale;
import java.util.Scanner;

public class def02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double aluno = sc.nextDouble();

        if(aluno >= 7) {
            System.out.println("APROVADO");
        }else {
            System.out.println("REPROVADOR");
        }

        sc.close();
    }
}
