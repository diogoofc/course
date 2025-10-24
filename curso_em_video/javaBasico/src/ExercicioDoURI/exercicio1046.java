package ExercicioDoURI;

import java.util.Scanner;

public class exercicio1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao ;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}
