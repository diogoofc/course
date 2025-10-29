package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exerciciosURI1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int notasValidasCount= 0;
        double somaNotasValidas = 0.0;


        while (notasValidasCount < 2){
            double notaLida = sc.nextDouble();
            if (notaLida >= 0.0 && notaLida <= 10.0){
                somaNotasValidas += notaLida;
                notasValidasCount++;
            }
            else {
                System.out.println("nota invalida");
            }
        }
        double media = (double) somaNotasValidas / 2.0;
        System.out.printf("media = %.2f%n", media);
        sc.close();
    }
}
