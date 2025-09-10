import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1005 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }
}
