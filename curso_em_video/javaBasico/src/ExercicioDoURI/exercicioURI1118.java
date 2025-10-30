package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int respostaNovoCalculo ;

        do {
            int notasValidasContadas = 0;
            double somaDasNotas = 0.0;

            while (notasValidasContadas < 2) {
                double nota = sc.nextDouble();

                if (nota >= 0 && nota <= 10.0) {
                    somaDasNotas = somaDasNotas + nota;
                    notasValidasContadas++;
                } else {
                    System.out.println("nota invalida");
                }
            }
            double media = somaDasNotas / 2.0;
            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                respostaNovoCalculo = sc.nextInt();
            }
            while (respostaNovoCalculo != 1 && respostaNovoCalculo != 2);
            }
            while (respostaNovoCalculo == 1);
        sc.close();
    }
}
