package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicoURi1002 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n =  3.14159;
        double raio = sc.nextDouble();


         double area = n * Math.pow(raio,2);

         System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
