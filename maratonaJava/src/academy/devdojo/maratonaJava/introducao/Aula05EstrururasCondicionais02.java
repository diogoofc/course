package academy.devdojo.maratonaJava.introducao;

public class Aula05EstrururasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade > 18 categoria adulto

//        int idade = 11;
//
//        if (idade < 15 ) {
//            System.out.println("Infantil");
//        } else if (idade >= 15 && idade < 18) {
//            System.out.println("Juvenil");
//        }else {
//            System.out.println("Adulto");
//        }

        int idade = 18;
        String categotia;

        if (idade < 15 ) {
            categotia = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categotia =  "Juvenil";
        }else {
            categotia = "Adulto";
        }
        System.out.println(categotia);


    }
}
