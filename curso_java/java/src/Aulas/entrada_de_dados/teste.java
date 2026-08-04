package Aulas.entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();

        System.out.printf(" %s tem %d anos e %.2f de altura", nome , idade , altura);

    }
}
