programa
{
	
	funcao inicio()
	{
		escreva("{ EXERCICIO 006 - Conversor de medidas }\n")
		real metros
		escreva("Distancia em metros: ")
		leia(metros)
		escreva("\n")
		escreva("---------- CONVERTENDO ---------- \n")

		escreva(metros / 1000 + " Km\n") 
		escreva( metros / 100 + " Hm\n")
		escreva(metros / 10 + " Dam\n") 
		escreva (metros * 10 + " dm\n")
		escreva(metros * 100 + " cm\n") 
		escreva(metros * 1000  + " mm\n") 

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 431; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */