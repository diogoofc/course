package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();


        while (x != 0){
            int somaPares = 0;
            if (x % 2 != 0){
                x++;
            }
            for (int i = 0; i < 5; i++){
                somaPares = somaPares + x;
                x += 2;
            }
            System.out.println(somaPares);
            x = sc.nextInt();
        }
        sc.close();
    }
}
