package aula_Saida_de_dados_em_java;

import java.util.Locale;

public class aula1 {

public static void main(String[] args) {
		
		
		double x = 10.35784;
		String nome = "Diogo";
		int idade = 22;
		double renda = 1700.0;
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("RESULTADO = " + x + " MENTROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}
}
