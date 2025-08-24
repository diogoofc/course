import java.util.Scanner;

public class PraticaEtruturaIfElse {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite sua idade: ");
//        int idade  = sc.nextInt();
//
//        if(idade >= 18) {
//            System.out.println("Você é maior de idade");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }

//        sc.close();


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite um número inteiro: ");
//        int numero = sc.nextInt();
//
//        if(numero > 0) {
//            System.out.println("O númeoro é Positivo.");
//        }
//        else if (numero < 0 ) {
//            System.out.println("O número é Negativo.");
//        }
//        else {
//            System.out.println("O número é Zero");
//        }
//
//
//        sc.close();



        Scanner sc  = new Scanner(System.in);

        System.out.println("Fala sua idade nadador: ");
        int idade = sc.nextInt();


        if(idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        }
        else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        }
        else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        }
        else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        }
        else if (idade >= 18) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idade insuficiente para competir.");
        }

        sc.close();









    }
}





