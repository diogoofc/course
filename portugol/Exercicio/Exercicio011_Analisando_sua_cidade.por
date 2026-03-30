programa
{
	inclua biblioteca Texto --> txt
	funcao inicio()
	{
		escreva("{EXECICIO 011 - Analisando sua cidade }\n" )
		cadeia nome
		escreva("Em que cidade você mora? ")
		leia(nome)
		escreva("\n")
		escreva("--------- ANALISANDO ---------\n")
		escreva("Você mora na cidade " + txt.caixa_alta(nome) + " \n")
		escreva("A primeira letra é " + txt.obter_caracter(nome , 0) + "\n")
		escreva("E contém " + txt.numero_caracteres(nome) + " caracteres.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 118; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */