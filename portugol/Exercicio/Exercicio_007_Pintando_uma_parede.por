programa
{
	
	funcao inicio()
	{
		escreva("{ EXERCICIO 007 - Pintando uma parede }\n")
		escreva("Informação importante: um litro de tinta pinta 2m²")
		escreva("--------------------------------------------------\n")
		real largura
		escreva("Largura da parede: ")
		leia(largura)
		real altura
		escreva("Altura da parede: ")
		leia(altura)
		escreva("\n")

		real mul = largura*altura
		real div = mul/2
		escreva("Uma parede " + largura + " x " + altura + " tem área de " + mul + " m²\n")
		escreva("Precisamos de " + div + " latas de tintas")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */