package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Números Ímpares

        int X = sc.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
