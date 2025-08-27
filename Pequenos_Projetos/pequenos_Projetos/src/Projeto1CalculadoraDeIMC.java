import java.util.Scanner;

public class Projeto1CalculadoraDeIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc =  peso / (altura * altura);


        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }

       else if  (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        }
       else if (imc >= 25 && imc < 30) {
           System.out.println("Sobrepeso");
        }
       else if (imc >= 30 && imc < 40) {
           System.out.println("Obesidade");
        }
       else  {
           System.out.println("Obesidade grave");
        }
        System.out.printf("Seu IMC é %.2f\n", imc);



        sc.close();
    }
}
