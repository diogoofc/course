package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorValor = 0;
        int posicaoDoMaior = 0;

        for (int i = 1; i <= 100; i++) {
            int numeroAtual = sc.nextInt();

            if (numeroAtual > maiorValor) {
             maiorValor = numeroAtual;
             posicaoDoMaior = i;
            }
        }
        System.out.println(maiorValor);
        System.out.println(posicaoDoMaior);

        sc.close();
    }
}
