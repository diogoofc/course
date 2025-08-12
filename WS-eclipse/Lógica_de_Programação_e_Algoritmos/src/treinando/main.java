package treinando;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Sanduiche meuSanduiche = new Sanduiche();
		meuSanduiche.montarSanduiche();
		
		
		
		 
		 sc.close();
		

	}

}

class Carne {
    String tipoDeCarne = "carne moída"; 
    double precoDaCarne = 25.50;
}

class Pao {
    int fatiaDePao = 2;
}

class Queijo {
    String tipoDeQueijo = "muçarela";
    int fatias = 2;
}

class Sanduiche {
    Carne carneParaSanduiche = new Carne();
    Pao paoParaSanduiche = new Pao();    
    Queijo queijoParaSanduiche = new Queijo();

    public void montarSanduiche() {
        System.out.println("Pegando o pão...");
        System.out.println("Cortando o pão...");
        System.out.println("Colocando o queijo no pão...");
        System.out.println("Colocando a carne...");
        System.out.println("O sanduíche está pronto!");
    }
}

