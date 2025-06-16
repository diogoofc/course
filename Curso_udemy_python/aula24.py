"""
Operadores in e not in
Strings são iteráveis
 0 1 2 3 4 5
 d i o g o o
-6-5-4-3-2-1
"""
# nome = 'diogoo'
# print(nome[2])
# print(nome[-4])
# print('goo'in nome)
# print('sim' in nome)
# print(10 * '-')
# print('goo'not in nome)
# print('sim'not in nome)


nome = input('Digite seu nome: ')
encontrar = input('Digite  o que deseja encontrar: ')

if encontrar in nome:
    print(f'{encontrar} está em {nome}')
else:
    print(f'{encontrar} não está em {nome}')   
