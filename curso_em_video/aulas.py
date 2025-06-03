# # Aula 01
# Seja um programador  

'''Vantagens dos programadores
Resolve problemas mais rapidos, mais criativos, espirito de comunidade, aprender
as coisas mais rápido'''



# Aula 02
'''De onde vem python
python é:
linguagem de propósito geral, fácio e intuitivo, multiplataforma, batteries included
livre, organizada, orientada a objetoss, muitas bibliotecas.'''
'''principios áreas:
inteligência artificial, biotecnologia, computação 3D.
'''
#aula 03


# Aula 04


# print('ola, mundo')

# print(8+6)

# print('8'+'6')

# print('----------------------------------------------------------')

# nome = 'Diogo'
# idade = 21
# peso = 90

# print(nome , idade , peso)

# nome = input('Qual é seu nome?')
# idade = input('Quantos anos vocé tem?')
# peso = input('Quanto vocé pesa?')

# print(nome , idade , peso)



# Aula 05



# Aula 06
# Tipos Primitivos e Saida de Dados

# int = 7,-4,0,9875
# float = 4.5 , 0.0076 , -15.223 , 7.0
# bool = true ou false
# str = 'olá' , '7.5' , ''


# n1 = int(input('digite um numero: '))
# n2 = int(input('digite mais um numero: '))
# soma = n1 + n2
# #print('A soma entre ', n1, 'e', n2, ' vale ',soma )
# print(f'A soma entre {n1} e {n2} vale {soma}')




# Aula 07
'''
Operadores Aritméticos
Operações aritiméticos
(adição +) , (subtração -) , (multiplicação *) , (pot~encia **),
(divisão / ) ,(divisão inteira //) , (resto da divisão % )
 
(Ordem de procedência) 
(1- () ) 
(2- **)
(3- *,/,//,% )
(4- +,-).
\n e para quebra a linha
end= '' e para da continuidade na mesma linha 
'''


# n1 = int(input('Digite um valor: '))
# n2 = int(input('Outro valor: '))
# s = n1 + n2
# m = n1 * n2
# d = n1 / n2
# di = n1 // n2 
# e = n1 ** n2
# print(f'A soma é {s}, \n o produto é {m}, \n e a  divisão é {d:.3f} \n ', end=' ')
# # print('A soma é {}, o produto é {}, e a divisao é {}'.format(s, m, d), end=' ')
# print('Divisão inteira {} \n e potência {}'.format(di, e))


# Aula 08
# Trabalhando com módulos

# import math
# num = int(input('Digite um numero: '))
# raiz = math.sqrt(num)
# print(f'A raiz de {num} é iqual a {raiz:.2f}')


# from math import sqrt
# num = int(input('Digite um numero: '))
# raiz = sqrt (num)
# print(f'A raiz de {num} é iqual a {raiz:.2f}')

# Aula 09 
'''Manipulando texto
manipulando cadeia de texto'''


# frase = 'Curso em vídeo python'
# print(f'O comprimento da frase é {len(frase)}')
# print(frase.count('o'))
# print(frase.find('deo'))
# print(frase.find('android'))
# print('Curso'in frase)
# print(frase.replace('python','android'))
# print(frase.upper())
# print(frase.lower())
# print(frase.capitalize())
# print(frase.title())
# print(frase.strip())
# print(frase.split())
# print('-'.join(frase))
# print(frase[15:])


# Aula 10
# Condições (Parte 1)

# Condições simples e compostas

# tempo= int(input('Qunantos anos tem seu carro? '))

# if tempo <=3:
#     print('carro novo')
# else:
#     print('carro velho')
# print('--FIM--') 


# nome = str(input('Qual é seu nome? '))
# if nome == 'Diogo':
#     print('Que nome espetacular!')
# else:
#     print('Que nome mais normal !')
# print(f'Bom dia, {nome}!')

# n1 = float(input('Fala a primeira nota: '))
# n2 = float(input('Fala a segunda nota: '))
# m = (n1 + n2)/2
# print(f'A sua média foi {m:.1f}')
# if m >= 6.0:
#     print('Sua média foi boa! MEUS PARABÉNS! ')
# else:
#     print('A sua média foi ruim! TEM QUE ESTUDA MAIS!')    

 # aula 11


 # Aula 12 = condições Aninhadas

# nome = str(input('Qual é o seu nome? '))
# if nome  == 'Diogo':
#     print('Que nome mais bonito!')
# elif nome == 'João' or nome == 'Felipe' or nome == 'Maria':
#     print('Seu nome e bem popular no brasil.') 
# else:
#     print('Seu nome e bem normal.')
# print(f'Tenha um bom dia, {nome}!')








