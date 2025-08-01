package Entrada_de_dados;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite sua altura:");
		double altura = scanner.nextDouble();
		
		System.out.println("Seu nome é " + nome + " e tem "+ idade + " anos, e tem " + altura + " de altura\n");
		
		scanner.close();
	 

	}

}
