package uri_online;

import java.util.Locale;
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double aluno1 = sc.nextDouble();
        double aluno2 = sc.nextDouble();
        double aluno3 = sc.nextDouble();

        double media = (aluno1*2 + aluno2*3 + aluno3*5) / 10;
        System.out.printf("MEDIA = %.1f\n", media);


        sc.close();
    }
}
