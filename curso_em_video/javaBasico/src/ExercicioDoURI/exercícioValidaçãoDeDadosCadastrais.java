package ExercicioDoURI;

import java.util.Scanner;

public class exercícioValidaçãoDeDadosCadastrais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        do {
            System.out.println("1- Digite seu nome : ");
            nome = sc.next();
            if (nome.length() > 3) {
                System.out.println("válido");
            }else {
                System.out.println("Erro.tenta novamente");
            }
        }while (nome.length() <= 3);

        int idade;
            do {
                System.out.println("2- Digite sua idade: ");
                idade = sc.nextInt();

                if (idade < 0 || idade > 150) {
                    System.out.println("Erro! Idade inválida.");
                }
            }while (idade < 0 || idade > 150);

            char sexo;
            do{

            System.out.println("sexo F ou M");
            sexo = sc.next().charAt(0);

            if (sexo != 'f' && sexo != 'm'){
                System.out.println("Erro: Sexo inválido (digite 'f' ou 'm').");
            }

        }while (sexo != 'f' && sexo != 'm');

            System.out.println("Cadastro Sucesso!");

        sc.close();
    }
}
