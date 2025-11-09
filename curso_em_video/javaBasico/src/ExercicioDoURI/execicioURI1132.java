package ExercicioDoURI;

import java.util.Scanner;

public class execicioURI1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int min, max;

        if (X > Y){
            max = X;
            min = Y;
        }else {
            max = Y;
            min = X;
        }

        int soma = 0;

        for (int i = min; i <= max; i++){
            if (i % 13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
