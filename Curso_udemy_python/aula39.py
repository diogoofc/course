# EXERCICIO DO WHILE
"""
Iterando strings com while
"""
nome = 'Diogo'


indice = 0
novo_nome = ''
while indice < len(nome):
    letra = nome[indice]
    novo_nome += f'*{letra}'
    indice += 1

print(novo_nome)    
  

# nome = input('Digite uma frase ou qualquer nome: ')
# i = 0

# while i < len(nome):
#     print(f'letra {i+1}: {nome[i]}')

#     i += 1




