programa
{
	inclua biblioteca Matematica 
	funcao inicio()
	{
		escreva("{ EXERCICIO 008 - Desconto no produto }\n")
		real preco
		escreva("Qual é o preço do produto: ")
		leia(preco)
		real produto = Matematica.arredondar(preco-(preco*5/100), 2)
		escreva("Com 5% de desconto, o produto sai por R$" + produto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */