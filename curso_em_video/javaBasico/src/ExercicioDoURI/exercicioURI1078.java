package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Tabuada

        int N = sc.nextInt();

        for (int i=1; i<=10; i++){
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);
        }
        sc.close();
    }
}
