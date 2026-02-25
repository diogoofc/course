programa
{
	inclua biblioteca Tipos --> t
	funcao inicio()
	{
		escreva("{ EXERCICIO 004 - Operações Aritméticas }\n")
		inteiro numero1
		escreva("Digite um número: ")
		leia(numero1)
		inteiro numero2
		escreva("Digite outro número: ")
		leia(numero2)
		escreva("\n")

		escreva("---------- RESULTADO ---------- \n")
		inteiro soma = numero1 + numero2
		inteiro diferenca = numero1 - numero2
		inteiro produto = numero1 * numero2
		inteiro divisao = numero1 / numero2
		real divisaoo = t.inteiro_para_real(numero1)/numero2
		inteiro resto = numero1 % numero2

		escreva("SOMA = " + soma + "\n")
		escreva("DIFERENÇA = " + diferenca + "\n")
		escreva("PRODUTO = " + produto + "\n")
		escreva("DIVISÃO INTEIRA = " + divisao + "\n")
		escreva("DIVISÃO REAL = " + divisaoo + "\n")
		escreva("RESTO DA DIVISÃO = " + resto + "\n")
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */