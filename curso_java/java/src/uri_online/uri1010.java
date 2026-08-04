package uri_online;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigopeca1 = sc.nextInt();
        int  numeropeca1= sc.nextInt();
        double valorpeca1 = sc.nextDouble();

        int codigopeca2 = sc.nextInt();
        int numeropeca2= sc.nextInt();
        double valorpeca2 = sc.nextDouble();

        double total = (numeropeca1 * valorpeca1) + (numeropeca2 * valorpeca2);

        System.out.printf("VALOR A PAGAR:  R$ %.2f%n", total);
        sc.close();
    }
}
