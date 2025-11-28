package ExercicioDoURI;

import java.util.Scanner;

public class exercicioUsuarioEsenha {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        String nome;
        String senha;

        do {
            System.out.println("Digite seu nome: ");
            nome = Sc.next();

            System.out.println("Digite sua senha: ");
            senha = Sc.next();

            if (nome.equalsIgnoreCase(senha)){
                System.out.println("Erro: Senha não pode ser igual ao nome");
            }else {
                System.out.println("Sucessor");
            }

        }while (nome.equalsIgnoreCase(senha));


        Sc.close();
    }
}
