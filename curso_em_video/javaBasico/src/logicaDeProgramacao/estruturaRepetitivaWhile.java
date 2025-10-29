package logicaDeProgramacao;

import java.util.Scanner;

public class estruturaRepetitivaWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        int soma = 0;
//
//        while (x != 0) {
//            soma = soma + x;
//            x = sc.nextInt();
//        }
//        System.out.println(soma);


//
//        int x = 0;
//        int y = 4;
//
//        while (x < 3){
//            y = y + 2;
//            x = x + 1;
//            System.out.println(x + "-" + y);
//        }

//        int x = 4;
//        int y = 0;
//        int i = 0;
//
//        while (i < x){
//            i = i + 1;
//            y = y + 1;
//            System.out.println(i);
//            System.out.println(y);
//        }

        int canbalhota = 0;
        while (canbalhota < 4) {
            System.out.println("Canbalhota");
            canbalhota++;
        }
        sc.close();
    }
}
