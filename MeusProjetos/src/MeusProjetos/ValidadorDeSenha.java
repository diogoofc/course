package MeusProjetos;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "2003";
        String senhaDigitada;

        do {
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.next();

            if (!senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha incorreta! tenta de novo");
            }else {
                System.out.println("Acessor permitido");
            }
        }while (!senhaDigitada.equals(senhaCorreta));

        sc.close();
    }
}
