import java.util.Scanner;

public class exercicioUri1018 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        System.out.println(valor);

        int notasDe100 = valor / 100;
        valor = valor % 100;

        int notasDe50 = valor / 50;
        valor = valor % 50;

        int notasDe20 = valor / 20;
        valor = valor % 20;

        int notasDe10 = valor / 10;
        valor = valor % 10;

        int notasDe5 =  valor / 5;
        valor = valor % 5;

        int notasDe2 = valor / 2;
        valor = valor % 2;

        int notaDe1 = valor / 1;
        valor = valor % 1;

        System.out.printf("%d nota(s) de R$ 100,00%n", notasDe100);
        System.out.printf("%d nota(s) de R$ 50,00%n", notasDe50);
        System.out.printf("%d nota(s) de R$ 20,00%n", notasDe20);
        System.out.printf("%d nota(s) de R$ 10,00%n", notasDe10);
        System.out.printf("%d nota(s) de R$ 5,00%n", notasDe5);
        System.out.printf("%d nota(s) de R$ 2,00%n", notasDe2);
        System.out.printf("%d nota(s) de R$ 1,00%n", notaDe1);

        sc.close();

    }
}
