package MeusProjetos;

import java.util.Random;
import java.util.Scanner;

public class JogoeAdivinhaçãoQuenteOuFrio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Boas-vindas Ao jogador.");
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;


        do {
            tentativas++;
            System.out.println("Qual seu palpite?");
            palpite = sc.nextInt();
            int distancia = Math.abs(numeroSecreto - palpite);

            if (palpite == numeroSecreto) {
                System.out.println("Parabens você acertou! é foi em tantas "+ tentativas);
            } else if (distancia <= 5) {
                System.out.println("Tá pegando fogo!!");
            } else if (distancia <= 15) {
                System.out.println("Tá Quente!");
            }else {
                System.out.println("Tá frio...");
            }
        }while (palpite != numeroSecreto);
        System.out.println("\n--- Fim de Jogo ---");
        System.out.println("Obrigado por jogar!");
        sc.close();
    }

}
