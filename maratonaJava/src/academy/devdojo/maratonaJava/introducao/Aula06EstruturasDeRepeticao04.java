package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal;parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + " R$ "+valorParcela);
            }
            else {
                break;
            }
        }


    }
}
