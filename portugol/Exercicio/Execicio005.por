programa
{
	/*
	Ex005: Programa para ler as duas notos de um aluno e calcule a sua média dinal.
	
	*/
	
	funcao inicio()
	{
		escreva("{ EXERCICIO 005 - Média do aluno }\n")
		// Declaração de Variáveis
		real nota1
		// Entrada de Dados
		escreva("Primeira nota: ")
		leia(nota1)
		real nota2
		escreva("Segunda nota: ")
		leia(nota2)
		real media = (nota1+nota2) /2
		escreva("\n--------- RESULTADOS ---------")
		// Resultado Finais
		escreva("\nAs notas do aluno foram " + nota1 + " e " + nota2 + "\n")
		escreva("A média final foi " + media)
		escreva("\n\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */