package academy.devdojo.maratonaJava.introducao;

public class Aula05EstrururasCondicionais03 {
    public static void main(String[] args) {
        double salario = 2000;
        String mensagemDoar = "Eu vou doar 500 pro Diogo";
        String mensagemNaoDoar = "Ainda eu não tenho condiçoes, mais vou ter!";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        }else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
