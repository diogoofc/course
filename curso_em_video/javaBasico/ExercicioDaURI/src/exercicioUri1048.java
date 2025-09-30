import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        int percentual;
        double reajuste;
        double novoSalario;


        if (salario >= 0 && salario <= 400.00) {
            percentual = 15;
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;
        }
        else if (salario >= 400.01 && salario <= 800.00) {
            percentual = 12;
            reajuste = salario * 0.12;
            novoSalario = salario + reajuste;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 10;
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 7;
            reajuste = salario * 0.07;
            novoSalario = salario + reajuste;
        }
        else {
           percentual = 4;
           reajuste = salario * 0.04;
           novoSalario = salario + reajuste;
        }

        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%%n",percentual);

        sc.close();

    }
}
