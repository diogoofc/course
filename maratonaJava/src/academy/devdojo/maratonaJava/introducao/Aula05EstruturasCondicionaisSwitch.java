package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprime o dia da semena, considerando 1 como domingo

        int dia = 8;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
        }

       String sexo = "H";
        switch (sexo){
            case "H":
                System.out.println("Homem");
                break;
            case "F":
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");

        }





    }
}
