import java.util.Scanner;

public class PraticaOperadorTernário {
    public static void main(String[] args) {

        int numero = 10;
        String resultado = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println(resultado);



        boolean isLogado = true;
        String mensagem  = isLogado ? "Acesso Permitido" : "Acessor Negado";
        System.out.println(mensagem);



        double valorDaCompra = 250.0;
        double valorDoFrete =  valorDaCompra >= 200.0 ? 0.0 : 25.0;
        System.out.println("O valor do frete é: R$ " + valorDoFrete);




    }
}
