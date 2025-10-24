package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double Q1, Q2, Q3,Q4;

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        sc.close();
    }

}
