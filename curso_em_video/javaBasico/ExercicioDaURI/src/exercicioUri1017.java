import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1017 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        int distancia = tempoGasto * velocidadeMedia;
        double litros = distancia / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();

    }
}
