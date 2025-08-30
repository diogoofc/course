import java.util.Scanner;

public class praticar {
    public static void main (String[] args) {
        //Par ou Ímpar
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite um número: ");
//        int numero = sc.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.println("O número é PAR? ");
//        }else {
//            System.out.println("O número e IMPAR? ");
//        }
//        sc.close();

        // Maior de dois números
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite um número: ");
//        int a = sc.nextInt();
//
//
//        System.out.println("Digite outro numero: ");
//        int b= sc.nextInt();
//
//        if(a > b) {
//            System.out.println(" O maior é! " + a);
//        }else if (a < b){
//            System.out.println("O menor é! " + b);
//        }else {
//            System.out.println("Os numero são iguais");
//        }
//        sc.close();

          //Tabuada

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um número: ");
         int numero = sc.nextInt();

        System.out.println("----TABUADA" + numero + "----");

        for(int i = 1; i <= 10; i++) {
            int resultador = numero * 1 ;
            System.out.printf("%d x %d = %d\n", numero,i,resultador);
        }
             sc.close();




    }
}
