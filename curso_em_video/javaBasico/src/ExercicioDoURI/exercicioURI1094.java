package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);

            if (tipo == 'C'){
                totalCoelhos += quantia;
            } else if (tipo == 'R') {
                totalRatos += quantia;
            } else if (tipo == 'S') {
                totalSapos += quantia;
            }

        }

        int totalCobaias = totalCoelhos + totalRatos + totalSapos;

        double perCoelho = (double) totalCoelhos / totalCobaias * 100.0;
        double perRatos = (double) totalRatos / totalCobaias * 100.0;
        double perSapos = (double) totalSapos / totalCobaias * 100.0;


        System.out.println("Total: "+ totalCobaias + " cobaias");
        System.out.println("Total de coelhos: "+ totalCoelhos);
        System.out.println("Total de ratos: "+ totalRatos);
        System.out.println("Total de sapos: "+ totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", perCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", perRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", perSapos);


        sc.close();
    }
}
