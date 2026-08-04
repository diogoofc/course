package Aulas.desafios;

import java.util.Scanner;

public class def03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        if(idade < 12){
            System.out.println("CRIANÇA");
        }
        else if (idade >= 12 && idade <= 17) {
            System.out.println("ADOLESCENTE");
        }else {
            System.out.println("ADULTO");
        }
        sc.close();
    }
}
