import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nomeVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = totalVendas * 0.15;
        double total = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();

    }
}
