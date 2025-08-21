public class Operadores_Aritmeticos {
    public static void main(String[] args) {

        double pao = 10.50;
        double queijo = 7.50;
        double acucar = 1.00;
        double desconto = 2.00;
        int totalDiasDoMes = 30;



        double valorTotal = pao + queijo + acucar;
        double valorComDesconto = valorTotal - desconto;
        double valorTotalDoMes = valorComDesconto * totalDiasDoMes;
        double valorTotalDividido = valorComDesconto / 2;


        System.out.println("Valor Total = R$" + valorTotal);
        System.out.println("Valor Com Desconto = R$" + valorComDesconto);
        System.out.println("Valor Dividido = R$" + valorTotalDividido);
        System.out.println("Valor Total Do Mes = R$" + valorTotalDoMes);

    }
}
