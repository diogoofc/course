programa
{
	inclua biblioteca Texto --> txt
	funcao inicio()
	{
		escreva("{EXERCICIO 012 - Seu nome }\n ")
		cadeia nome
		escreva("Digite seu nome completo: ")
		leia(nome)
		inteiro posicao = txt.posicao_texto(" ", nome, 0)
		cadeia primeiro = txt.extrair_subtexto(nome, 0, posicao)
		escreva("Seu primeiro nome é " + primeiro)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */