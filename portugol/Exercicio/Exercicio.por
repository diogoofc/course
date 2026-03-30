programa
{
	real n1, n2, media
	inteiro faltas
	
	funcao inicio()
	{
		escreva("Entre com a primeira nota: ")
		leia(n1)
		escreva("Entre com a segunda nota: ")
		leia(n2)

		media = (n1 + n2) / 2

		escreva("Quantas falta você tem? ")
		leia(faltas)

		se(faltas >= 10){
			escreva("Resultado: Reprovado\n")
			escreva("Sua media foi ", media , " Mais foi reprovado por causa de ", faltas , " Faltas")
		}senao se(media >= 7){
			escreva("Resultado Aprovado")
		}senao se ((media >= 5) e (media < 7)) {
			escreva("Resultado: Recuperação")
		}senao{
			escreva("Resultado: Reprovado \n")
		}

		escreva("\nSua média foi de " , media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */