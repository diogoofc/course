package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1047 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicioEmMinutos = (horaInicial * 60) + minutoInicial;
        int fimEmMinutos = (horaFinal * 60) + minutoFinal;

        int duracaoTotal, hora, minutos;

        if (fimEmMinutos > inicioEmMinutos) {
            duracaoTotal = fimEmMinutos - inicioEmMinutos;
        } else{
            duracaoTotal = (24 * 60 - inicioEmMinutos) + fimEmMinutos;
        }
        hora = duracaoTotal / 60;
        minutos = duracaoTotal % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hora, minutos);

        sc.close();
    }
}
