import java.util.Scanner;

public class PraticaEstruturaFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Digite um número inteiro: ");
//        int numero = sc.nextInt();
//
//        System.out.println("---TABUADA DO " + numero + "---");
//
//
//        for(int i = 1;i <=10;i++){
//            int resultado = numero * i;
//            System.out.printf("%d x %d = %d\n", numero, i, resultado);
//    }


//        for(int i = 1;i<=50;i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        int soma = 0;
        for(int i = 0; i <= 100; i++){
            soma = soma + i;
        }
        System.out.println("A soma é: " + soma);


    }
}
