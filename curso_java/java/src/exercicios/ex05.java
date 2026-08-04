package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = nota1+nota2;

        if (media > 60.0) {
            System.out.println("NOTA FINAL = "+ media);
        } else {
            System.out.println("NOTA FINAL = "+ media);
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
