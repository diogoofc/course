programa
{/*Exercicio 021: Positivo ou Negativo
*/
	
	funcao inicio()
	{
		inteiro num
		escreva("Digite um número ")
		leia(num)
		se(num > 0){
			escreva("Você digitou um número POSITIVO")
		}senao{
			se(num < 0){
				escreva("Você digitou um número NEGATIVO")
			}senao{
				escreva("VocÊ digitou um número NULO")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */