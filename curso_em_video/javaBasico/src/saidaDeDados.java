import java.util.Locale;

public class saidaDeDados {
    public static void main(String[] args) {
        // Sem quebra de linha ao final:
        System.out.print("Bom dia!");

        // Com quebra de linha ao final:
        System.out.println("Bom dia!");

        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n " , x);

        String nome = "Diogo";
        int idade = 22;
        double renda = 1820.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        // %f = Ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha
        // %c = para caractere



    }
}
