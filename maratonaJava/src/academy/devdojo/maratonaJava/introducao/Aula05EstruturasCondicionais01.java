package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprabebida = idade >= 18;

        if (isAutorizadoComprabebida) {
            System.out.println("Autorizado a compra bebida alcólica");
        }
        else {
            System.out.println(" Não Autorizado a compra bebida alcólica");
        }
    }
}
