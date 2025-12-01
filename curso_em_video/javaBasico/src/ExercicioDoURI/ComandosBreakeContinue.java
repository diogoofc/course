package ExercicioDoURI;

import java.util.Scanner;

public class ComandosBreakeContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um minimo: ");
        int num = sc.nextInt();

        System.out.println("Digite o max: ");
        int max = sc.nextInt();

        for (int i=num; i<=max; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("o valor de i é: "+ i);
                break;
            }
        }

        sc.close();

    }
}
