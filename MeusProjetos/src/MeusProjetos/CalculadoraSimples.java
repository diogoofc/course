package MeusProjetos;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double primeiroNumero = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        String operador = sc.next();

        System.out.println("Digite outro número: ");
        double segundoNumero = sc.nextDouble();


        switch (operador){
            case "+":
              double soma = primeiroNumero + segundoNumero;
                System.out.printf("Resultado: %.2f + %.2f = %.2f", primeiroNumero, segundoNumero, soma);
                break;
            case "-":
                double subtracao = primeiroNumero - segundoNumero;
                System.out.printf("Resultado: %.2f - %.2f = %.2f", primeiroNumero, segundoNumero, subtracao);
                break;
            case "*":
                double multiplicacao = primeiroNumero * segundoNumero;
                System.out.printf("Resultado: %.2f * %.2f = %.2f", primeiroNumero,segundoNumero,multiplicacao);
                break;
            case "/":
                if (segundoNumero == 0){
                    System.out.println("Divisão por zero não é permitida");
                }else {
                    double divisao = primeiroNumero / segundoNumero;
                    System.out.printf("Resultado: %.2f / %.2f = %.2f", primeiroNumero, segundoNumero, divisao);
                }
                break;
            default:
                System.out.println("Operador inválido");
        }


        sc.close();
    }
}
