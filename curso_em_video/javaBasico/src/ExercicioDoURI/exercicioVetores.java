package ExercicioDoURI;

import java.util.Scanner;

public class exercicioVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] A = new int[5];
//        int[] B = new int[5];
//
//        for (int i=0; i<5; i++) {
//            A[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<5; i++) {
//            B[i] = A[i];
//        }
//        for (int i=0; i<5; i++) {
//            System.out.println(B[i] + " ");
//        }

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i=0; i<10; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<10; i++) {
            B[i] = sc.nextInt();
        }
        for (int i=0; i<9; i++) {
            C[i] = A[i] + B[i];
        }
        for (int i=0; i<10; i++) {
            System.out.println(C[i] + " ");
        }







        sc.close();
    }
}
