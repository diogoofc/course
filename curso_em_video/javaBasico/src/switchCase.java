
import java.util.Scanner;

public class switchCase {
    public static void main (String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        String dia;
//
//        if (x == 1) {
//            dia = "Domingo";
//        } else if (x == 2) {
//            dia = "Segunda";
//        } else if (x == 3) {
//            dia = "Terça";
//        } else if (x == 4) {
//            dia = "Quarta";
//        } else if (x == 5) {
//            dia  = "Quinta";
//        } else if (x == 6) {
//            dia = "Sexta";
//        } else if (x == 7) {
//            dia = "Sabado";
//        }
//        else {
//            dia = "Valor invalido";
//        }
//        System.out.printf("Dia da semana: "+ dia);
//        sc.close();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7 :
                dia = "Sabado";
            default:
                dia = "Valor invalido";
        }
        System.out.println("Dia da semana: "+ dia);
        sc.close();






    }
}
