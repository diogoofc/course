import java.util.Scanner;

public class SimuladordeCaixaEletrônico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo =1500.00;
        int opcao;

        do{

            System.out.println("\n--- CAIXA ELETRÔNICO---");
            System.out.println("1.Consulta Saldo");
            System.out.println("2.Deposito Valor");
            System.out.println("3.Sacar Valor");
            System.out.println("0.Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu sando atual é R$ ", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valorDeposito = sc.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("Deposito feito com sucessor");
                    break;
                case 3:
                    System.out.println("Qual o valor que deseja sacar: ");
                    double valorSaque;
                    valorSaque = sc.nextDouble();


                    if (valorSaque <= saldo){
                        saldo = saldo - valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    }else
                        System.out.println("Saldo insuficiente.");
                    break;
                case 0 :
                    System.out.println("Obrigado por utilizar nosso caixa eletrônico.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }while (opcao!= 0);

        sc.close();
    }
}
