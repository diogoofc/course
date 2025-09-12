import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2.0 * base + 2.0 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);


        sc.close();

    }
}
