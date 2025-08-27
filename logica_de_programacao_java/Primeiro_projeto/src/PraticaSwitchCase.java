import java.util.Scanner;

public class PraticaSwitchCase {
    public static void main(String[] args) {

//        int mes = 8;
//
//        switch (mes) {
//            case 1:
//                System.out.println("Janeiro");
//                break;
//            case 2:
//                System.out.println("Fevereiro");
//                break;
//            case 3:
//                System.out.println("Março");
//                break;
//            case 4:
//                System.out.println("Abril");
//                break;
//            case 5:
//                System.out.println("Maio");
//                break;
//            case 6:
//                System.out.println("Junho");
//                break;
//            case 7:
//                System.out.println("Julho");
//                break;
//            case 8:
//                System.out.println("Agosto");
//                break;
//            case 9:
//                System.out.println("Setembro");
//                break;
//            case 10:
//                System.out.println("Outubro");
//                break;
//            case 11:
//                System.out.println("Novembro");
//                break;
//            case 12:
//                System.out.println("Dezembro");
//                break;
//            default:
//                System.out.println("Mês inválido");
//    }

        Scanner sc = new Scanner(System.in);

        String cargo = "Gerente";

        switch (cargo) {
            case "Gerente":
                System.out.println("Acesso Total");
                break;
            case "Analista":
                System.out.println("Acesso A Relatórios");
                break;
            case "Estagiário":
                System.out.println("Acesso Restrito");
                break;
            default:
                System.out.println("Cargo não reconhecido");
                break;

        }
        sc.close();
    }
}