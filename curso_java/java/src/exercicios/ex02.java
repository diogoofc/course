import java.util.Locale;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQ = sc.nextDouble();

        double area, preco;

        area = largura * comprimento;
        preco = area * metroQ;

        System.out.printf("Area = %.2f%n" , area);
        System.out.printf("Preco %.2f%n = " , preco);



        sc.close();
    }
}
