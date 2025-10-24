package ExercicioDoURI;

import java.util.Scanner;

public class exercicioUri1020 {
    public static  void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDeDias = sc.nextInt();

        int anos = totalDeDias / 365;
        int diasRestantes = totalDeDias % 365;

        int meses = diasRestantes / 30;
        int dia = diasRestantes % 30;

        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dia(s)%n",dia);

        sc.close();

    }
}
