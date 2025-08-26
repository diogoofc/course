public class EstrututaIfElse {
    public static void main(String[] args) {

//        int idade = 22;
//
//        if(idade >=18) {
//            System.out.println("Você e maior de idade");
//        }
//        else{
//            System.out.println("Você e menor de idade");
//        }

//        boolean estaChovendo = true;
//
//        if(!estaChovendo) {
//            System.out.println("Vamos sai para o parque");
//        }
//        else {
//            System.out.println("Vamos fica em casa");
//        }

        boolean temDinheiro = false;
        boolean temcartao = false;

        if(temcartao && temcartao) {
            System.out.println("Pede um ifood e um zé delivery");
        }
        else if (temDinheiro || temcartao) {
            System.out.println("Pede so ifood");
        }
        else {
            System.out.println("Não pede nada");
        }

        String mensagem = (temDinheiro) ? "Pede um ifood" : "Come o que tem em casa";
        System.out.println(mensagem);

        if (temDinheiro) {
            System.out.println("pede um ifood");
        }
        else {
                System.out.println("Come o que tem em casa");

            }





    }
}
