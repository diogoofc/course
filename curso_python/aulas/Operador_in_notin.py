# Operador in e not in
# Strings são iteráveis
# 0 1 2 3 4 5
# D i o g o o
#-6-5-4-3-2-1

nome = 'Diogo'
# print(nome[3])
# print(nome[-4])

# print('o' in nome)
# print('todo' in nome)
# print(10 * '-')
# print('g' not in nome)
# print('zero' not in nome)

nome = input('Digite seu nome: ')
encontra = input('Digite o que encontra: ')

if encontra in nome:
    print(f'O {encontra} esta no nome {nome}?')
else:
    print(f'O {encontra} não esta no nome {nome}?')


