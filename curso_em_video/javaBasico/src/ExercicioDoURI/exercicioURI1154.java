package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicioURI1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double somaIdades = 0.0;
        int contadorIdade = 0;

        int idade = sc.nextInt();

        while (idade >= 0){
            somaIdades = somaIdades + idade;
            contadorIdade++;
            idade = sc.nextInt();
        }
        if (contadorIdade > 0){
            double media = somaIdades / contadorIdade;
            System.out.printf("%.2f%n", media);
        }
        sc.close();
    }
}
