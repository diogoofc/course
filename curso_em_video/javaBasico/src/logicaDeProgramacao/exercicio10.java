package logicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for (int i=0; i<N; i++){
            vet[i] = sc.nextDouble();
        }

        for (int i=0; i<N; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        double soma = 0.0;
        for (int i=0; i<N; i++){
            soma = soma + vet[i];

        }
            System.out.println(soma);

            double media = soma / N;
            System.out.println(media);


        sc.close();
    }
}
