programa
{
	
	funcao inicio()
	{
		escreva("\n              VIACÃO ESTUDONAUTA           ")
		escreva("\n-------------------------------------------")
		escreva("\n VIAGEM ATÉ 200Km: \t\t\tR$0,50/Km")
		escreva("\nVIAGEM ACIMA DE 200Km: \t\tR$0,35/Km")
		escreva("\n=============================================\n")

		real km, fator, total

		escreva("Informe a distância total da viagem, em Km: ")
		leia(km)

		se (km  <= 200) {
			fator = 0.50
		}senao {
			fator = 0.35
		}
		total = km * fator

		escreva("------------------ RESULTADO --------------------")
		escreva("\nUma viagem de " + km + "Km vai custar R$" + fator + "/Km.")
		escreva("\n VALOR TOTAL: R$" + total)
		escreva("\n============================================\n\n")


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 739; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */