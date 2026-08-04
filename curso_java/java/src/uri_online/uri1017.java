package uri_online;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        double distancia = (double)(velocidade * tempo);
        double total = distancia / 12;

        System.out.printf("%.3f%n", total);
        sc.close();
    }
}
