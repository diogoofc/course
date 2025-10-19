package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao01Exercicio {
    public static void main(String[] args) {
        // Imprim todas os números pares de 0 até 1000000

        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
