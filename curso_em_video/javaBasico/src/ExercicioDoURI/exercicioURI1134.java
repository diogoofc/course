package ExercicioDoURI;

import java.util.Scanner;

public class exercicioURI1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorAlcool = 0;
        int contadorGasolina = 0;
        int contadorDiesel = 0;
        int codigo = sc.nextInt();

        while (codigo != 4){
            switch (codigo){
                case 1 :
                    contadorAlcool++;
                    break;
                case 2:
                    contadorGasolina++;
                    break;
                case 3:
                    contadorDiesel++;
                    break;
                default:
            }
            codigo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ contadorAlcool);
        System.out.println("Gasolina: "+ contadorGasolina);
        System.out.println("Diesel: "+ contadorDiesel);
        sc.close();
    }
}
