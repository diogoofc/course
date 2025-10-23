package logicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class praticaDeEntradaDeDados {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite seu nome completo: ");
//        String nome = sc.nextLine();
//
//        System.out.println("Digite sua idade: ");
//        int idade = sc.nextInt();
//
//        sc.nextLine();
//
//        System.out.println("Qual cidade você mora: ");
//        String cidade = sc.nextLine();
//
//        System.out.printf("%s você tem %d e mora em  %s%n", nome, idade, cidade);
//
//
//        sc.close();




        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Sua Matricular: ");
        int matricula = sc.nextInt();

        sc.nextLine();

        System.out.println("Nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Primeiro nota? ");
        double nota1 = sc.nextDouble();
        System.out.println("Segunda nota? ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2 ;

        System.out.printf("O aluno %s, matricula %d, obteve a média %.2f%n",nome, matricula, media);

        sc.close();








    }
}
