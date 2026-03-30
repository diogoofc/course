programa
{
	/*
	Ex002: programa para ler o nome, ano de nacimento e salário de um fucionário,
	mostrando em seguida a sua ficha funcional.
	Autor: Gustavo Guanabara
	*/
	funcao inicio()
	{
		// Declaração de Variáveis
		cadeia nome
		inteiro  ano
		real sal
		//Entrada de Dados
		escreva("Nome do Funcionário: ")
		leia(nome)
		escreva("Ano de Nascimento: ")
		leia(ano)
		escreva("Salario: R$")
		leia(sal)
		// Saida dos resultados
		escreva("\n--------- FICHA FUNCIONAL ---------")
		escreva("\nNOME: " + nome)
		escreva("\nNASCIMENTO EM " + ano)
		escreva("\nSALÁRIO DE R$" + sal)
		escreva("\n-----------------------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 639; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */