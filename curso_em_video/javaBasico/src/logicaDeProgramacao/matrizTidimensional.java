package logicaDeProgramacao;

import java.util.Scanner;

public class matrizTidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][][] matrizTridiminsional = new int[3][3][3];

        for (int i=0; i<matrizTridiminsional.length; i++){
            for (int j=0; j<matrizTridiminsional[i].length; j++){
                for (int k=0; k<matrizTridiminsional[i][j].length; k++){
                    matrizTridiminsional[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i=0; i<matrizTridiminsional.length; i++){
            for (int j=0; j<matrizTridiminsional[i].length; j++){
                for (int k=0; k<matrizTridiminsional[i][j].length; k++) {
                    soma += matrizTridiminsional[i][j][k];

                    if (matrizTridiminsional[i][j][k] % 2 == 0){
                        somaPares += matrizTridiminsional[i][j][k];
                    }else {
                        somaImpares += matrizTridiminsional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma Total = " + soma);
        System.out.println("Soma Pares = " + somaPares);
        System.out.println("Soma Impares = " + somaImpares);

        sc.close();
    }
}
