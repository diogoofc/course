package academy.devdojo.maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, booolean

        int idade = 22;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Diogo";

        System.out.println("o nome dele é " +nome + " Ele tem " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char "+ caractere);


    }
}
