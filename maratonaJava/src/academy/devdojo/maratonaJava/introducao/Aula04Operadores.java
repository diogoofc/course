package academy.devdojo.maratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores basicos = + - / *

        int numero01 = 10;
        int numero02 = 20;
        double soma = numero01 / (double) numero02;
        System.out.println(soma);

        // operador resto da soma = %

        int resto = 21 % 7;
        System.out.println(resto);

        // (< menor > maior)  (<= menor ou igual  >= maior ou igual) (== igual != Diferente ou igual)
        boolean isDezMaiorQuevinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteOuIgualAVinte = 10 != 20;
        System.out.println("isDezMaiorQuevinte "+ isDezMaiorQuevinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+ isDezIgualQueVinte);
        System.out.println("isDezDiferenteOuIgualAVinte "+ isDezDiferenteOuIgualAVinte);

        // Operadores logicos = && (AND), // (OR), !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta"+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+ isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrete = 200;
        double valorTotalContaPoupamca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrete > valorPlaystation || valorTotalContaPoupamca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel"+ isPlaystationCincoCompravel);

        // Operadores de atribuição =  (=, +=, -=, /=, %=)

        double bonus = 1800;// 1800.0
        bonus += 1000; // 2800.0
        bonus -= 1000; // 1800.0
        bonus *= 2; // 3600.0
        bonus /= 2; // 1800.0
        bonus %= 2; // 0.0
        System.out.println(bonus);



    }
}
