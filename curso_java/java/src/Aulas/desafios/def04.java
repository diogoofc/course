package Aulas.desafios;

import java.util.Scanner;

public class def04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("EQUILATERO");
        }else if (a == b || b == c || a == c) {
            System.out.println("ISOSCELES");
        }else {
            System.out.println("ESCALENO");
        }
        sc.close();
    }
}
