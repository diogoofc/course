programa
{
	inclua biblioteca Matematica --> M
	inclua biblioteca Tipos --> T
	funcao inicio()
	{
		escreva("{ EXERCICIO 010 - Não fume }\n")
		escreva("Cada cigarro reduz 10 minutos de vida\n")
		escreva("---------------------------------------\n")
		real anos
		escreva("Há quantos anos você fuma? ")
		leia(anos)
		real cigarros
		escreva("Quantos cigarros você fuma por dia? ")
		leia(cigarros)
		escreva("---------------------------------------\n")
		real total_cigarros = T.real_para_inteiro(anos*365)*cigarros
		real total =  M.arredondar((total_cigarros * 10) / (24 * 60 ), 2)
		
		escreva("Ao todo, até agora você já fumou " + total_cigarros + " cigarros!\n")
		escreva("Estima-se que você já perdeu " + total  + " dias de vida!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */