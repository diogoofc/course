package logicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class estruturaRepetitivaFor {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int soma = 0;
//        for (int i=0; i<n; i++) {
//            int x = sc.nextInt();
//            soma = soma + x;
//            System.out.println(soma);
//        }
//        sc.close();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double somaNotas = 0.0;
        int contadorAprovado = 0;
        int contadorReprovado = 0;
        int N = sc.nextInt();

        for (int i = 1; i<=N; i++) {
            System.out.println("Digite a nota do aluno "+ i);
            double nota = sc.nextDouble();
            somaNotas += nota;

            if (nota >= 7.0) {
                contadorAprovado++;
            }else {
                contadorReprovado++;
            }
        }
        double media = somaNotas / N;

        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Alunos aprovados: "+ contadorAprovado);
        System.out.println("Alunos reprovados: "+ contadorReprovado);
        sc.close();
    }
}
