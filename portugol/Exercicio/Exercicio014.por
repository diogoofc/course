programa
{
	/*Exercicio014: Consumidor ganha 10% de desconto ser gasta mais de 500 reis no mercado
	*/
	
	funcao inicio()
	{
		escreva("Qual foi o valor total das suas compras? ")
		real compras
		leia(compras)
		escreva("-----------------------------------------")
		escreva("\nvocê comprou R$", compras , " na nossa loja. obrigado")
		real des = (compras * 10) / 100
		real npre = compras-(compras*10/100)
		se (compras >= 500){
			escreva("\n====ATENÇÃO====")
			escreva("\nPor fazer mais de R$500 em compras, você vai receber R$", des , " de descontos")
			escreva("\nO valor a ser pago é de ", npre , "! volte sempre!")
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