package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;

        int senhaDigitada = sc.nextInt();

        while (senhaDigitada != senhaCorreta) {
            System.out.println("Senha invalida");
            senhaDigitada = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();

    }
}
