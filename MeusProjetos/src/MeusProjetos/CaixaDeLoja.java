package MeusProjetos;

import java.util.Locale;
import java.util.Scanner;

public class CaixaDeLoja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual e o valor do produtor R$: ");
        double preco = sc.nextDouble();
        double percentualDoDesconto;
        double valorFinal;
        int opcao;


        System.out.println("-- DESCONTOS--");
        System.out.println("1- Cliente comum 0% desconto");
        System.out.println("2- Cliente VIP 5% desconto");
        System.out.println("3- Funcionário 10% desconto");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Sem desconto "+ preco);
                break;
            case 2:
                percentualDoDesconto = preco * 0.10;
                valorFinal = preco - percentualDoDesconto;
                System.out.printf("Valor original = R$ %.2f com desconto fica R$ %.2f. ", preco, valorFinal);
                break;
            case 3:
                percentualDoDesconto = preco * 0.05;
                valorFinal = preco - percentualDoDesconto;
                System.out.printf("Valor original = R$ %.2f com desconto fica R$ %.2f.", preco, valorFinal);
                break;
            default:
                System.out.println("Opcão invalida");
                break;
        }


        sc.close();


    }
}
