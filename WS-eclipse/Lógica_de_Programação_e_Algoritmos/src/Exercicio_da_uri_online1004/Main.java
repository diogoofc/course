package Exercicio_da_uri_online1004;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X, Y, prod;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		prod = X*Y;
		
		System.out.println("PROD = "+ prod);
		
		
		sc.close();
	}

}
