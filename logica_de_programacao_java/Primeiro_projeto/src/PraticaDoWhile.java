import java.util.Scanner;

public class PraticaDoWhile {
    public static void main(String[] args){

//        int contagemRegressiva = 10;
//
//        while(contagemRegressiva>0){
//            System.out.println("Contagem Regressiva: " + contagemRegressiva);
//            contagemRegressiva--;
//        }
//        System.out.println("Feliz Ano Novo!");

//        Scanner sc = new Scanner(System.in);
//
//        int opcao = -1;
//
//        while (opcao !=0){
//            System.out.println("---MENU---");
//            System.out.println("1. Iniciar Jogo");
//            System.out.println("2. Ver Créditos");
//            System.out.println("0. Sair");
//            System.out.print("Escolha uma opção: ");
//
//            opcao = sc.nextInt();
//
//            if(opcao == 1){
//                System.out.println( "--> Iniciando o jogo...");
//            } else if (opcao == 2) {
//                System.out.println("--> Feito por Diogo Oliveira");
//            }
//            else if (opcao !=0){
//                System.out.println("--> Opção inválida, tente novamente. ");
//            }
//        }
//
//        System.out.println("\nObrigado por jogar!");
//        sc.close();




        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numerosDigitados;
        System.out.println("Digite um número (ou 0 para sair): ");
        numerosDigitados = sc.nextInt();

        while(numerosDigitados != 0){

         soma = soma + numerosDigitados;

         System.out.println("Digite outro número (ou 0 para sair): ");
         numerosDigitados = sc.nextInt();
        }
        System.out.println("\nA soma total dos números é: " + soma);
        sc.close();

    }
}
