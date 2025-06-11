# usuario = input('Digite o usuario: ')
# senha = input('Digite sua senha: ')

# if usuario == 'Diogo' and senha == '123':
#     print('acesso liberado')
# elif usuario == 'Diogo' or senha == '123':
#     print('Usuário ou senha incorretos')
# else:
#     print('Acesso negado')   

# ===============================================================
    
# numero = 10
 
# if numero > 1:
#     if numero > 2:
#         if numero > 3:
#             print('Número maior que 3')
#         else:
#             print('Número menor que 3')
#     else:
#         print('Número menor que 2')
# else:
#     print('Número menor que 1')


#==========================================================


# nome = input("Digite o nome do cliente: ")
# idade = int(input("Digite a idade: "))
# saldo = float(input("Digite o saldo da conta: "))
# numero_cliente = int(input("Digite o número do cliente: "))

# # Saída formatada usando interpolação
# print("\n--- DADOS CADASTRADOS ---")
# print("Cliente: %s" % nome)
# print("Idade: %d anos" % idade)
# print("Saldo: R$ %.2f" % saldo)
# print("Número do cliente: %d (hex: %x)" % (numero_cliente, numero_cliente))

# ===========================================================================

# numero = int(input('Digite um número (0  para sair): '))

# while numero != 0:
#     if numero % 2 == 0:
#         print('É par')
#     else:
#         print('É impar')

#         numero = int(input('Digite outro número (0 para sair): '))
        
# print('Programa encerrado')



# pares = 0
# impares = 0

# numero = int(input("Digite um número (0 para sair): "))

# while numero != 0:
#     if numero % 2 == 0:
#         print("É par.")
#         pares += 1
#     else:
#         print("É ímpar.")
#         impares += 1

#     numero = int(input("Digite outro número (0 para sair): "))

# print("\nPrograma encerrado.")
# print("Total de números pares:", pares)
# print("Total de números ímpares:", impares)

#=============================================================================




# contador = 0

# while contador < 10:
#     contador = contador + 1
#     print(contador)
# print('Fim')    



# resposta = 'S'

# while resposta == 'S':
#     nome = int(input('Digite um valor: '))
#     resposta = str(input('Quer continuar? [S/N] ')) .upper() 
# print('Fim')    


# numero = 1 
# par = impar = 0
# while numero != 0:
#     numero = int(input('Digite um valor: '))
#     if numero % 2 ==  0 :
#         par += 1
#     else:
#         impar += 1
# print(f'Você digitou {par} número par e {impar} números impar!')    




""" Calculadora com while """
# while True:
#     numero_1 = input('Digite um número: ')
#     numero_2 = input('Digite outro número: ')
#     operador = input('Digite o operador (+-/*): ')

#     numeros_validos = None

#     try:
#         num_1_float = float(numero_1)
#         num_2_float = float(numero_2)
#         numeros_validos = True
#     except:
#         numeros_validos = None

#     if numeros_validos is None:
#         print('Um ou ambos os números digitados são inválidos.')
#         continue

#     operadores_permitidos = '+-/*'

#     if operador not in operadores_permitidos:
#         print('Operador inválido.')
#         continue

#     if len(operador) > 1:
#         print('Digite apenas um operador.')
#         continue

#     print('Realizando sua conta. confira o resultador abaixo')
    
#     if operador == '+':
#         print(f'{num_1_float} + {num_2_float}',num_1_float + num_2_float)
#     elif operador == '-':
#         print(f'{num_1_float} - {num_2_float}',num_1_float - num_2_float)
#     elif operador == '/':
#         print(f'{num_1_float} / {num_2_float}',num_1_float / num_2_float)   
#     elif operador == '*':
#         print(f'{num_1_float} * {num_2_float}',num_1_float * num_2_float)  


#     sair = input('Quer sair? [s]im: ').lower().startswith('s')

#     if sair is True:
#         break




nota = (input('Digite um valor de nota: '))

# if nota >= 0 and nota <= 10:
#     print(nota)
# else:
#     print('nota invalida')

while nota < 0 or nota > 10:
    nota = float(input('Digite um valor VÁLIDO  de nota: '))
    print(nota)
