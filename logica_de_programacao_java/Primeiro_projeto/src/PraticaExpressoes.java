import java.util.Scanner;

public class PraticaExpressoes {
    public static void main(String[] args ) {

   //     Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite uma nota de 0 a 10: ");
//        int nota = sc.nextInt();
//        boolean  aprovado = nota >= 7;
//
//        System.out.println(aprovado);
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite um numero inteiro: ");
//        int numero = sc.nextInt();
//        boolean ispar = (numero % 2) == 0;
//
//        System.out.println("O número e PAR: " + ispar);
//
//        sc.close();



        Scanner sc = new Scanner(System.in);

        double salarioJoao = 1500.00;
        double salarioMaria = 1800.00;
        boolean ismaior  = salarioJoao > salarioMaria;
        boolean ismenor = salarioJoao <= salarioMaria;

        System.out.println(" O salário de João é maior que o de Maria? " + ismaior);
        System.out.println("O salário de João é menor ou igual ao de Maria? " + ismenor);

        sc.close();
    }
}
