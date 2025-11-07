package ExercicioDoURI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Praticado {
    public static void main(String[] args) {

        // Exercício 1: Múltiplos de 3
//        int numeroAtual = 1;
//
//        while (numeroAtual <= 50) {
//            if (numeroAtual % 3 == 0) {
//                System.out.println(numeroAtual);
//            }
//            numeroAtual++;
//        }

//        Scanner sc = new Scanner(System.in);
//
//        String senhaCorreta = "Diogo22";
//        System.out.println("Digite a senha: ");
//        String senhaDigitada = sc.next();
//
//        while (!senhaDigitada.equals(senhaCorreta)) {
//            System.out.println("Senha incorreta. tente novamente: ");
//            senhaDigitada = sc.next();
//        }
//        System.out.println("Acesso permitido");
//
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        int numerosPares = 0;
//        System.out.println("Digite o número (0 para Sair):  ");
//        int numero = sc.nextInt();
//
//        while (numero != 0 ) {
//            if (numero % 2 == 0){
//                numerosPares++;
//            }
//            System.out.println("Digite outros número: ");
//            numero = sc.nextInt();
//        }
//        System.out.println("Quantidade de numero pares digitados: "+ numerosPares);
//
//        sc.close();



//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        for(int i =10; i>=1; i--){
//            int produto = i * N;
//            System.out.println(i + " x " + N + " = " + produto);
//        }
//       sc.close();



        Scanner sc = new Scanner(System.in);

        int senha = 2024;
        System.out.println("Digite a senha: ");
        int senhaDigitada = sc.nextInt();

        while (senhaDigitada != 2024){
            System.out.println("ACESSO NEGADO");
            senhaDigitada = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
