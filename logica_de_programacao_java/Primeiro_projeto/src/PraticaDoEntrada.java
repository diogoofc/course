import java.util.Scanner;

public class PraticaDoEntrada {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- CADASTROS DE PRODUTOS -----");

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite a quantidade no estoque: ");
        int quantidade = sc.nextInt();

        System.out.println("Digite o preço unitario: ");
        double preco = sc.nextDouble();

        double valorTotal = quantidade * preco;

        System.out.println("\n---Produto cadastrado com sucesso---");
        System.out.printf("Produto: %s\n", nomeProduto);
        System.out.printf("Estoque: %d\n", quantidade);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Valor Total em estoque: R$ %.2f\n", valorTotal);


        sc.close();
;

    }
}
