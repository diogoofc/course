programa
{
/*Exercicio 017: Ano bissexto
*/
	
	funcao inicio()
	{
		escreva("Digite um ano qualquer: ")
		inteiro ano
		leia(ano)
		escreva("O ano ", ano)
		se(ano % 4 == 0 e ano % 100 != 0) {
			escreva(" É BISSEXTO")
		}senao{
			escreva(" NÃO É BISSEXTO")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 42; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */