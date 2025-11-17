package MeusProjetos;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual e o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * 2);

        if ( imc < 18.5){
            System.out.println("Abeixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc < 40) {
            System.out.println("Obesidade");
        }else {
            System.out.println("Obesidade grave");
        }

        System.out.printf("Paciente %s seu imc é %f %n", nome, imc);

        sc.close();

    }
}
