package uri_online;

import java.util.Locale;
import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double aluno1 = sc.nextDouble();
        double aluno2 = sc.nextDouble();
        double media = (aluno1 * 3.5 + aluno2 * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", media);
        sc.close();
    }
}
