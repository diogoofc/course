# Exercicio
"""
Faça um programa que peça ao ususário para digita um número inteiro,
informe se este número é par ou impar. Caso o usuário não  digita um número
inteiro, informe que não é um número inteiro.

"""
# entrada = (input('Digite um  numero: '))
 
# if entrada.isdigit():
#     entrada_int = int(entrada)
#     par_impar = entrada_int % 2 == 0
#     par_impar_texto = 'impar'
    
#     if par_impar:
#         par_impar_texto = 'par'


#     print(f'O número {entrada_int} é {par_impar_texto}')
# else:
#     print('Você não digitou um número inteiro')     


# try:
#     entrada_int = float(entrada)
#     par_impar = entrada_int % 2 == 0
#     par_impar_texto = 'impar'
    
#     if par_impar:
#         par_impar_texto = 'par'


#     print(f'O número {entrada_int} é {par_impar_texto}')
# except:
#     print('Você não digitou um número inteiro')  


"""
Faça um programa que~pergunta a hora ao usuário e, baseando -se no horário
descrito, exiba a saudação apropriada. EX
Bom dia 0-11, Boa tarde 12-17 e Boa noite 18-23.
"""

# entrada = input('Digite a hora em número inteiro: ')

# try:
#     hora = int(entrada)

#     if hora >= 0 and hora <= 11:
#         print('Bom dia')
#     elif hora >= 12 and hora <= 17:
#         print('Bom tarde')
#     elif hora >= 18 and hora <= 23:
#         print('Boa noite')
#     else:
#         print('Nao comenheço essa hora')   
# except:
#     print('Por favor, digite apenas números inteiros ')    
"""
Faça um programa que peça o primeiro nome do usuário, Se o nome tiver 4 letras ou menos
escreva "Seu nome e curto", se tiver entre 5 e 6 letras, escreva 
"Seu nome é normal", maior que 6 escreva "Seu nome é  muito grande".

"""

# nome = input('Digite seu nome: ')
# tamanho_nome = len(nome)

# if tamanho_nome > 1:
#     if tamanho_nome <= 4 :
#         print('Seu nome e curto')
#     elif tamanho_nome >= 5 and tamanho_nome <= 6:
#         print('Seu nome e normal')
#     else:
#         print('Seu nome e muito grande')        
# else:
#     print('Digite mais de uma letra.')    
