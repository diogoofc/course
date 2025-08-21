import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String [] args) {

//        System.out.println("Olá eu faço impressão e pulo linha");
//        System.out.print("Olá eu faço impressão na mesma linha");
//        System.out.printf("Olá eu faço impressão formatada");



        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Me fala a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é " + idade + " anos");




    }
}
