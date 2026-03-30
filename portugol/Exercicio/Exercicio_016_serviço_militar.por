programa
{
/*Exercicio 016: Serviço militar v1.0
*/
	inclua biblioteca Calendario --> c
	funcao inicio()
	{
		escreva("Em que ano você naceu? ")
		inteiro ano, idade
		leia(ano)
		idade = c.ano_atual() - ano
		escreva("-------------------------\n")
		escreva("Sua idade atual é ", idade , " anos\n")
		se (idade >= 18){
			escreva("Espero sinceramente que você tenha se alistado")
		}senao{
			escreva("Você ainda não completou 18 anos. não pode se alistar.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 28; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */