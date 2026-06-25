package Aulas.primeiro;
import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Olá mundo");
        System.out.println("Bom dia!");

        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resutado =  %.2f Metros%n", x );


        String nome = "Diogo";
        int idade = 22;
        double salario = 1800.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n por mes", nome, idade, salario);
    }
}
