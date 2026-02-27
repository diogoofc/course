programa
{
	inclua biblioteca Matematica 
	funcao inicio()
	{
		escreva("{ EXERCICIO 009 - Aumento Salario }\n")
		cadeia nome
		escreva("Nome do funcionário: ")
		leia(nome)
		real salario
		escreva("Salário: R$")
		leia(salario)
		real reajuste 
		escreva("Reajuste (%) : ")
		leia(reajuste)
		escreva("\n")
		escreva("--------- RESULTADO --------- \n")
		real conta = Matematica.arredondar(salario+(salario*reajuste/100), 2)
		escreva(nome + " ganhava R$ " + salario + "\n")
		escreva("e depois de ganhar " + reajuste + "% de aumento\n")
		escreva("Vai passar a ganhar R$" + conta)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */