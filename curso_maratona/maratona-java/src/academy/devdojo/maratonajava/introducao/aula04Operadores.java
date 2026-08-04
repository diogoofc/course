package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
    public static void main(String[] args) {
         int resto = 21 % 7;
         System.out.println(resto);

         // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezigualQueVinte1 = 10 == 20;
        boolean isDezigualQueVinte2 = 10 == 10.0;
        boolean isDezDiferenteQueVinte3 = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezigualQueVinte1);
        System.out.println(isDezigualQueVinte2);
        System.out.println(isDezDiferenteQueVinte3);

        //Operadores logicos  &&(AND) ||(OR) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaioQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaioQueTrinta " + isDentroDaLeiMaioQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalDaContaCorrete = 200;
        double valorTotalDaContaPoupanca = 10000;
        float playstation = 5000F;

        boolean isplaystation = valorTotalDaContaCorrete > playstation || valorTotalDaContaPoupanca > playstation;

        System.out.println("isplaystation " + isplaystation);



    }
}
