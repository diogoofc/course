import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1010 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigoPeca1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double totalPagar = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);

        sc.close();

    }
}
