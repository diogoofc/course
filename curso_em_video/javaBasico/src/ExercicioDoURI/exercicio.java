package ExercicioDoURI;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite um nota: ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10){
                System.out.println("nota valida "+ nota);
            } else {
                System.out.println("Nota inválida, digite novamente");
            }
        }while (nota < 0 || nota >10);

        sc.close();
    }
}
