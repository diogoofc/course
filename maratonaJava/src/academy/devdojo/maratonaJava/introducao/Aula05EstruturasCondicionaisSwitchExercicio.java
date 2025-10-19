package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou  final de semana
        // Considera 1 como domingo

        int dia = 1;
        switch (dia){
            case 1:
                System.out.println("Final De Semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final De Semana");
                break;
            default:
                System.out.println("Opção invalida");
        }



    }
}
