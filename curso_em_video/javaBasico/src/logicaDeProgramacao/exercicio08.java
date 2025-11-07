package logicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        char resp;

       do {
            System.out.print("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.printf("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
        sc.close();
    }
}
