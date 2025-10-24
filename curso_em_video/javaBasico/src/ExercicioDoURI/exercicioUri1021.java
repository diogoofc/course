package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1021 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorMonetario = sc.nextDouble();

        int totalEmCentavos = (int)(valorMonetario * 100);
        System.out.println("NOTAS:");

        int notaDe100 = totalEmCentavos / 10000;
        totalEmCentavos %= 10000;

        int notaDe50 = totalEmCentavos / 5000;
        totalEmCentavos %= 5000;

        int notaDe20 = totalEmCentavos / 2000;
        totalEmCentavos %= 2000;

        int notaDe10 = totalEmCentavos / 1000;
        totalEmCentavos %= 1000;

        int notaDe5 = totalEmCentavos  / 500;
        totalEmCentavos %= 500;

        int notaDe2 = totalEmCentavos / 200;
        totalEmCentavos %= 200;


        System.out.printf("%d nota(s) de R$ 100.00%n", notaDe100);
        System.out.printf("%d nota(s) de R$ 50.00%n", notaDe50);
        System.out.printf("%d nota(s) de R$ 20.00%n", notaDe20);
        System.out.printf("%d nota(s) de R$ 10.00%n", notaDe10);
        System.out.printf("%d nota(s) de R$ 5.00%n", notaDe5);
        System.out.printf("%d nota(s) de R$ 2.00%n",notaDe2);


        System.out.println("MOEDAS:");

        int moedasDe1 = totalEmCentavos / 100;
        totalEmCentavos %= 100;

        int moedasDe50 = totalEmCentavos / 50;
        totalEmCentavos %= 50;

        int moedaDe25 = totalEmCentavos / 25;
        totalEmCentavos %= 25;

        int moedasDe10centavos = totalEmCentavos / 10;
        totalEmCentavos %= 10;

        int moedasDe5centavos = totalEmCentavos / 5;
        totalEmCentavos %= 5;

        int moedasde1centavos = totalEmCentavos / 1;
        totalEmCentavos %= 1;

        System.out.printf("%d moeda(s) de R$ 1.00%n", moedasDe1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedasDe50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedaDe25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedasDe10centavos);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedasDe5centavos);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedasde1centavos);

        sc.close();

    }
}
