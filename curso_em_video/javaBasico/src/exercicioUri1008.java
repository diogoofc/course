import java.util.Locale;
import java.util.Scanner;

public class exercicioUri1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHoras = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHoras;

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
