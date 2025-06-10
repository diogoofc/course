 #Exercicio 01

# nome = input('Digite seu nome: ')
# #print('É um prazer te conhecer', nome)
# print(f'É um prazer te conhcer ,{nome}')


# Exercicio 02

# n1 = int(input('Digite um numero: '))
# n2 = int(input('Digite outro numero: '))
# soma = n1+n2
# print(f'A soma entre {n1} e {n2} é igual a {soma}')


# Execicio 03
# faça um programa que leia algo pelo teclado e mostre na tela 
# o seu tipo primitivo e todas as informações possiveis sobre ela.

# a = input('Digite algo:')
# print('O tipo primitivo desse valor é', type(a))
# print('so tem espaço?', a.isspace())
# print('É um numero?',a.isnumeric())
# print(' É alfabético?', a.isalpha())
# print('É alfanumérico?',a.isalnum())
# print('Ésta em maiúsculas?',a.isupper())
# print('Ésta em minúsculas?', a.islower())
# print('Ésta capitalizada?', a.istitle())



# Exercicio 05
# Antecessor e Sucessor

#faça um programa que leia um número inteiro e mostra na tela o seu sucessor
# e seu antecessor.

# n = int(input('Digite um numero: '))
# a = n -1
# s = n + 1
# print(f'Analisando o valor {n}, seu antecessor é {a}, e o sucessor é {s}')
# print('Analisando o valor {}, seu antecessor é {}, e o sucessor é {}'.format(n, a, s))


# n = int(input('Digite um numero: '))
# # print(f'Analisando o valor {n}, seu antecessor é {n-1}, e o sucessor é {n+1}')
# print('Analisando o valor {}, seu antecessor é {}, e o sucessor é {}'.format(n, n-1, n+1))



# Exercicio 06
# Dobro,triplo,raiz quadrada

# crie um algoritmo que leia um número e mostra o seu dobro,triplo,e raiz quadrada.

# n = int(input('Digite um número: ')) 
# d = n * 2
# t = n * 3
# r = n ** (1/2)
# print(f'O dobor de {n},vale {d} ')
# print(f'o triplo de {n}, vale {t}')
# print(f'A reiz quadrada de {n}, é igual a  {r:.2f}')



# n = int(input('Digite um número: ')) 
# print(f'O dobor de {n},vale {n*2} ')
# print(f'o triplo de {n}, vale {n*3}')
# print(f'A reiz quadrada de {n}, é igual a {n**(1/2):.2f}')


# Exercicio 07
# Média Aritmética

# Desenvolva um programa que leia as duas notas de um aluno,
# calcule e mostra a sua média.

# a1 = float(input('Primeira nota do aluno: '))
# a2 = float(input('Segunda nota do aluno: '))
# m = (a1+a2) /2
# print(f'A Média entre {a1:.1f}, e {a2:.1f} é igual a {m:.1f}')

# Exercicio 08 
# Conversor de Medidas

# Escreva um programa que leia um valor e mostra e o exibe
# convertido em centimetros e milimetros.

# medida = float(input('Uma distancia em metros: '))
# cm = medida * 100
# mm = medida * 1000
# print('A medida de {}m corresponde a {}cm e {}mm'.format(medida, cm, mm) )



#Exercicio 09
# Tabuada

# Faça um programda que leia um número interio qualquer e mostra na tela a sua
# tabuada.

# t = int(input('Digite um número para ver sua tabuada: '))
# print('-' *12)
# print(f'{t} x {1:2} = {t*1}')
# print(f'{t} x {2:2} = {t*2}')
# print(f'{t} x {3:2} = {t*3}' )
# print(f'{t} x {4:2} = {t*4}' )
# print(f'{t} x {5:2} = {t*5}' )
# print(f'{t} x {6:2} = {t*6}') 
# print(f'{t} x {7:2} = {t*7}' )
# print(f'{t} x {8:2} = {t*8}' )
# print(f'{t} x {9:2} = {t*9}' )
# print(f'{t} x {10} = {t*10}')
# print('-' *12)

# Exercicio 10
# Converso de Moedas

# Crie um programa que leia quanto dinheiro uma pessoa tem na 
# carteira e mostra quantos dólares ela pode compra .
# Considere US$1,00=R$3,27



# real = float(input('Quanto de dinheiro você tem na carteira? R$'))
# dolar = real / 5.84
# print(f'Com R${real:.2f} você pode compra US${dolar:.2f}')


# Exercicio 11
# Pintando parede

# Faça um programa que leia a largaura e a altura de uma parede em metros,
# calcule a sua area e a quantidade de tinta necessaria para pinta-la,
# sabendo que cada litro de tinta, pinta uma área de 2m².

# larg = float(input('Largura da parede: '))
# alt = float(input('Altura da parede: '))
# área = larg * alt  
# print(f'Sua parede tem a dimidão de {larg}x{alt} e sua área é de {área:.2f}m².')
# tinta = área / 2
# print(f'Para pinta essa parede, você precisará de {tinta}l de tinta.')


# Exercicio 12
# Calculando Descontos

# Faça um algoritmo que leia o preço da um produto e mostra seu
# novo preço,com 5% de desconto.


# preço = float(input('Qual é o prço do produto? R$'))
# novo = preço - (preço * 5 / 100)
# print(f'O produto que custava R${preço:.2f}, na promoção \n com desconto de 5% ele custa R${novo:.2f}')


# Exercicio 13
# Reajuste salarial

# Faça um algoritimo que leia o salario de um fucionario e mostra seu novo
# salarário,com 15% de aumento.


# sal = float(input('Qual é o salario do fucionario? '))
# novo =  sal + (sal * 15 /100)
# print(f'Um fucionario que ganhava R${sal:.2f}, com 15% de aumento, passa a receber R${novo:.2f}.')



# pro = float(input('Preço do produto? '))
# novo = pro -(pro * 10 /100)
# p = pro + (pro * 15 /100)
# print(f'O produto custa R${pro:.2f},mais pagando  a vista tem 10% de desconto R${novo:.2f}')
# print(f'mais se pacelar vai custar R${p:.2f}')


# Exercicio 14
# Conversor de Temperatura

# Escreva um programa que converta uma temperatura digitada em °C e converta para °F.

# c = float(input('Informe a temperatura em °C: '))
# f = ((9*c)/5)+32
# print(f'A temperatura de {c}°C corresponde a {f}°F')


# Exercicio 15 
# Aluguel de Carro

# Escreva um programa que pergunta a quantidade de Km
# percorrido por um carro alugado e a quantidade de dias
# pelos quais ele foi alugado.calcule o preço a paga 
#,sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.



# d = int(input('Quantos dia alugado? '))
# Km = float(input('Quantos Km rodado? '))
# pago = (d * 60) + (Km * 0.15)
# print(f'O total a  pagar é de R${pago:.2f}')



# Exercicio 16
# Quebrando um número

# Crie um programa que leia um número real qualquer pelo teclado e 
# mostra na tela a sua porção inteira.

# from math import trunc
# num = float(input('Digite um  numero: '))
# # m = math.trunc(num)
# print(f'o valor digitado foi {num} e a sua porção inteira é {trunc(num)}')


# num = float(input('Digite um valor: '))
# print(f'O valor digitado foi {num} e a porção inteira é {int(num)}')



# Exercicio 17
# Catetos e Hipotenusa
''' faça um programa que leia o comprimento do cateto oposto e do cateto adjacento,
  de um triângulo retângulo, calcule e mostre o comprimento do hipotenusa.     '''

# co = float(input('Comprimento do cateto oposto: '))
# ca = float(input('Comprimento do cateto adjacente: '))
# hi = (co ** 2 + ca ** 2) ** (1/2)
# print(f'A hipotenusa vai medir {hi:.2f}')


# import math
# co = float(input('Comprimento do cateto oposto: '))
# ca = float(input('Comprimento do cateto adjacente: '))
# hi = math.hypot(co, ca)
# print(f'A hipotenusa vai medir {hi:.2f}' )


# from math import hypot
# co = float(input('Comprimento do cateto oposto: '))
# ca = float(input('Comprimento do cateto adjacene: '))
# hi = hypot(co, ca)
# print(f'A hipotenusa vai medir {hi:.2f}')

# Exercicio 18
# Seno, cosseno e tangente

''' faça um programa que leia um ângulo qualquer e mostra na taela 
 o valor do seno, cosseno e tangente desse ângulo.
 '''

# import math
# ângulo = float(input('Digite o ângulo que você deseja: '))
# seno = math.sin(math.radians(ângulo))
# print(f'O ângulo de {ângulo} tem o SENO de {seno:.2f}.')
# cosseno = math.cos(math.radians(ângulo))
# print(f'O ângulo de {ângulo} tem o COSSENO de {cosseno:.2f}.')
# tangente = math.tan(math.radians(ângulo))
# print(f'O ângulo de {ângulo} tem o TANGENTE de {tangente:.2f}.')



# from math import radians, sin, cos, tan
# ângulo = float(input('Digite o ângulo que você dejesa: '))
# seno = sin(radians(ângulo))
# print(f'O ângulo d {ângulo} tem o SENO de {seno:.2f}.')
# cosseno = cos(radians(ângulo))
# print(f'O ângulo de {ângulo} tem o COSSENO de {cosseno:.2f}.')
# tangente = tan(radians(ângulo))
# print(f'O ângulo de  {ângulo} tem o TANGENTE de {tangente:.2f}.')

# Exercicio 19
# Sorteando um item na lista
''' um professor quer sortear um dos seus quatro alunos para apagar 
o quadro. Faça um programa que ajuda ela, lendo o nome delas e escrevendo
 o nome do escolhido.'''


# import random
# n1 = str(input('Primeiro aluno: '))
# n2 = str(input('Segundo aluno: '))
# n3 = str(input('Terceiro aluno: '))
# n4 = str(input('Quarto aluno: '))
# lista = [n1, n2, n3, n4]
# escolhido = random.choice(lista)
# print(f'O  aluno escolhido foi {escolhido}')


# from random import choice
# n1 = str(input('Primeiro aluno:'))
# n2 = str(input('Segundo aluno: '))
# n3 = str(input('Terciro aluno: '))
# n4 = str(input('Quarto aluno: '))
# lista = [n1, n2, n3, n4]
# escolhido = choice(lista)
# print(f'O aluno escolhido foi {escolhido}')


# Exercicio 20
# Sorteando uma ordem de lista

'''Faça um programa que leia o nome dos quatro alunos e mostrem a ordem sorteada'''

# import random
# n1 = str(input('Primeiro aluno: '))
# n2 = str(input('Segundo aluno: '))
# n3 = str(input('Tercerio aluno: '))
# n4 = str(input('Qaurto aluno: '))
# lista = [n1, n2, n3, n4]
# random.shuffle(lista)
# print('A ondem de apresentação será ')
# print(lista)


# from random import shuffle
# n1 = str(input('Primeiro aluno: '))
# n2 = str(input('Segundo aluno: '))
# n3 = str(input('Tercerio aluno: '))
# n4 = str(input('Qaurto aluno: '))
# lista = [n1, n2, n3, n4]
# shuffle(lista)
# print('A ondem de apresentação será ')
# print(lista)

# Exercicio 21
# tocando um MP3

'''Faça um programa em python que abra e reproduza o áudio de um arquirvo MP3'''



# Exercicio 22
# Analisador de texto
'''Crie um programa que leia o nome completo de uma pessoa e mostre
O  nome com todas letra maiuscular e minúscular
Quantas letras ao todo(sem considerar espaços)
Quantas letras tem o primeiro nome'''

# nome = str(input('Digite seu nome completo: ')).strip()
# print('Analisando seu nome...')
# print(f'Seu nome em maiúsculas é {nome.upper()}')
# print(f'Seu nome em minúscular é {nome.lower()}')
# print(f'Seu nome tem ao todo {len(nome)- nome.count(' ')} letras')
# # print(f'Seu primeiro nome tem {nome.find(' ')} letras')
# separa = nome.split()
# print(f'Seu primeiro nome é {separa[0]} e ele tem {len(separa[0])} letras')


# Exercicio 23
# Separando digitos de um numero

'''Faça um programa que leia um número de 0 a999 e mostre na tela cada 
um dos digitos separados'''

# num = int(input('Informe um número: '))
# n = str(num)
# print(f'Analisando um número: {num}')
# print(f'Unidade: {n[3]}')
# print(f'Dezena: {n[2]}')
# print(f'Centena: {n[1]}')
# print(f'milhar: {n[0]}')

# num = int(input('Informe um número: '))
# u = num // 1 % 10
# d = num // 10 % 10
# c = num // 100 % 10
# m = num // 1000 % 10
# print(f'Analisando um número {num}')
# print(f'Unidade: {u}')
# print(f'Dezena: {d}')
# print(f'Centena: {c}')
# print(f'Milhar: {m}')


# Exercicio 24
# Verificando as primeiras letras de um texto

'''Crie   um programa que leia o nome de uma cidade e diga se ela
começa ou não com o nome"SANTO".''' 

# city = str(input('Em que cidade você nasceu? ')).strip()
# print(city[:5].upper() == 'SANTO')




# Exercicio 25 
#

'''Crie um programa que leia o nome de uma pessoa e diga se ela 
tem "SILVA" nome.'''

# nome = str(input('Qual e seu nome completo? ')).strip()
# print(f'Seu nome tem Silva? {'SILVA' in nome.upper()}')

# Exercicio 26
#

'''Faça um programa que leia uma frase pelo teclado e mostra:
Quantas vezes aparece a letra "A
Em que  posição a primeira vez"
Em que posição ela aparece a última vez'''

# nome = str(input('Digite uma frase: ')).upper().strip()
# print(f'A letra A aparece {nome.count('A')} vezes na frase.')
# print(f'A primeira letra A aparece na posição {nome.find('A')+1}.')
# print(f'A última letra A aparece na posição {nome.rfind('A')+1}')




# Exercicio 27
#

'''Faça um programa que leia o nome completo de uma pessoa 
em seguida o primeiro e o último nome separadamente.
'''


# nome = str(input('Digite seu nome completo: ')).strip()
# print('Muito prazer em te conhecer!')
# separado = nome.split()
# print(f'Seu primeiro nome é {separado[0]}')
# # print(f'Seu último nome é {(nome[len(nome)-1])}')
# print(f'Seu ultimo nome é {nome[15:]}')


# Exercicio 28
'''escreva um programa que faça o computador "pensar"
em um número interio entre 0 e 5 e peça para o ususario tentar descobri qual foi o número escolhido pelo computador

 o programa devera escrever na tela se o  usuário venceu ou perdeu'''

# from random import randint
# from time import sleep
# computador = randint(0, 5) # faz o computador "pensar"
# print('-=-'* 20)
# print('vou pensar em um número entre 0 e 5. tenta adivinhasr...')
# print('-=-'* 20)
# jogador = int(input('Em que numero eu pensei? ')) # jogador tenta adivinhar
# print('PROCESSANDO...')
# sleep(2)
# if jogador == computador:
#     print('PARABÉNS!Você me ganhou!')
# else:
#     print(f'GANHEI! eu pensei no número {computador} e não no {jogador}')




# Exercicio 29
'''escreva um programa que leias a velocidade de um veiculo.
se ele ultrapassar 80km/h, mostre uma mensagem dizendo que ele foi multado.
A multa vai custar R$7.00 por cada km acima do limite'''

# velocidade = float(input('Digite a velocidade do carro (km/h): '))
# ex = velocidade - 80
# multa = ex * 7
# if velocidade > 80:
#     print('Você foi multador!')
#     print(f'Você excedeu o limite em {ex:.1f} km/h.')
#     print(f'O valor da multa é R${multa:.2f}')
# else:
#     print('Velocidade estar dentro do limite. Dirija com  seguranção!')    
    



# Execicios 30
'''Crie um progrmaga que leia um número interio e mostra na tela se ele é par ou impar.
'''

# nu = int(input('Me fala um número: '))
# if nu % 2 == 0:
#     print('Este número é par.')
# else:
#     print('Este número é impar.')


# Exercicios 31
'''Desenvolva um  programa que pergunte a distância de uma viagem em km.
calcule o preço da passagem,cobrador R$0,50 por km para viagem ded ate 200km e 0,45 para viagens mais longas
'''

# distancia = float(input('Qual e a distancia da sua viagem? '))
# print(f'vamos para mais uma viagem de {distancia}km.')
# if distancia <= 200:
#     preco = distancia * 0.50
# else:
#     preco = distancia * 0.45
# print(f' o preço da passagem será R${preco:.2f}')   



# Exercicios 32
'''faça um programa que leia um  ano qualquer e mostra se ale é BISSEXTO.'''
# from datetime import date
# ano = int(input('qual ano quer analisar?coloque 0 para analisar o ano atual:'))
# if ano == 0:
#     ano = date.today().year
# if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
#     print(f'O ano {ano} é BISSEXTO')
# else:
#     print(f'O ano {ano} não é BISSEXTO')    




# Exercicios 33
'''faça um programa que leia três números e mostra qual é o maior e qual é o menor.
'''

# a = int(input('Primeiro número: '))
# b = int(input('Segundo númeoro: '))
# c = int(input('Terceiro número: '))

# verificando quem é menor

# menor = a 
# if b<a and b<c:
#     menor = b
# if c<a and c<b:
#     menor = c

# # veificando o maior

# maior = a 
# if b>a and b>c:
#     maior = b
# if c>a and c>b:
#     maior = c 
# print(f'O menor número fio {menor}')
# print(f'O maior número fio {maior}')




# Exercicios 34
'''Escreva um programa que pergunta o salario de um fucionario e calcule o valor do seu aumento
para  salário superiores a R$ 1.250,00, calcule um aumento de 10%
para os inferiores ou iguais e aumneto é de 15%'''


# salario = float(input('Qual e o salario do fucionario? R$'))
# if salario > 1250:
#     aumento = salario * 0.10
# else:
#     aumento = salario * 0.15
# novo = salario + aumento    
# print(f'O aumento será de R${aumento:.2f}')
# print(f' O novo salario será de R${novo:.2f}')


# salário = float(input('Qual é o salário do fucionario? R$ '))
# if salário <= 1250:
#     novo = salário + (salário * 15 / 100)
# else:
#     novo = salário + (salário * 10 / 100)
# print(f'Quem recebia R${salário:.2f} vai passa a ganha {novo:.2f} agora')



# Exercicios 35 
'''desenvolve um programa que leia o comprimento de três retas e diga ou usuário se elas podem ou não formar 
triângulo.'''


# print('-='*20)
# print('Analisador de triângulos')
# print('-='*20)
# r1 = float(input('Primeiro segmento: '))
# r2 = float(input('segundo segmento: '))
# r3 = float(input('terceiro segmento: '))
# if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2:
#     print('Os segmentos acima PODEM FORMAR triângulo! ')
# else:
#     print('Os segmentos acima NÃO PODEM FORMAR triângulo! ')


# Exercicios 36
'''Escreva um programa para aprovar o empréstimo bancário para
a compra de uma casa. O programa vai pergunta o valor da casa,
o salário do comprador e em quantos anos ele vai pagar

Calcule o valor da prestação mensal sabendo que ela não 
pode exceder 30% do salário ou então o emprestimo será
negado.'''

# casa = float(input('O valor da casa: R$'))
# salário = float(input('Salário do comprador: R$'))
# anos = int(input('Qauntos anos de financiamento? '))
# prestação = casa / (anos * 12)
# minimo = salário * 30 / 100
# print(f'para pagar uma casa de R${casa:.2f} em {anos} anos')
# print(f'a prestação será de R$ {prestação:.2f}')
# if prestação <= minimo:
#     print('Empréstimo pode ser CONCEDISO!')
# else:
#      print('Empréstimo NEGADO!')







# Exercicio 37
'''Escreva um programa que leia um número inteiro
qualquer e peça para o usuário escolher qual será a base de conversão:

-1 para binário
-2para octal
-3 para hexadecimal
 '''

# n1 = int(input('Digite um número: '))
# print('''Escolha uma das bases para conversão:
# [ 1 ] converter para BINÁRIO
# [ 2 ] converte para OCTAL
# [ 3 ] converte para HEXADECIMAL''')
# opção = int(input('sua opção: '))
# if opção == 1:
#     print(f'{n1} convertido para BINÁRIO é igual a {bin(n1)[2:]}')
# elif opção == 2:
#     print(f'{n1} convertindo para OCTAL é igual a {oct(n1)[2:]}')
# elif opção == 3:
#     print(f'{n1} convertido para HEXADECIMAL é igaul a {hex(n1)[2:]}')
# else:
#     print('Opção inválida. tente novamente.')



# Exercicio 38
'''Escreva um programa que leia dois número interio e compre-os,
mostrando na tela uma mensagem:

- O primeiro valor é maior
- O segundo é maior
- Não existe valor maior, os dois são iguais
'''








# Exercicio 39
''' Faça um programa que leia o ano de nascimento de um 
jovem e informe, de acordo com sua idade:

- Se ele ainda vai se alistar ao serviço militar
- Se é a hora de se alistar
- Se já passou do tempo do alistamento.


Seu programa também deverá mostra  o compo que falta ou que passou do prazo.
'''









# Exercicio 40
'''cire um programa que leia duas notas de um aluno e calcule sua
média, mostrando uma mensagem no final, de 
acordo com a média atingida:

- Média abaixo de 5.0:
REPROVADO
- Média entre 5.0 e 6.9:
RECUPERAÇÃO
- Média 7.0 ou superior:
APROVADO'''

# nota1 = float(input('Digite sua nota: '))
# nota2 = float(input('Digite sua segunda nota: '))
# media = (nota1 + nota2) / 2


# if media >= 0 and media <= 5:
#     print('Você estar REPROVADOR!')

# elif media >= 5 and  media <= 6.9:
#     print('Você esta em recuperação!')

# elif media >= 7.0:
#     print('Você esta aprovador!') 





# Exercicio 41
''' A confederação nacional de nataçao precisa de um programa que leia
 o ano de nascimento de um atleta e mostre  sua categoria, de acordo com a idade:

 - Até 9 anos : MIRIN
 - Até 14 anos:INFANTIL
 - Até 19 anos:JUNIOR
 - Até 20 anos:SÊNIOR
 - Acima: MESTRE
'''
ano_nacimento = float(input('Digite sua data de nacimento: '))
idade = 2025 - ano_nacimento


if idade  >= 9 and idade <= 13:
    print('MIRIN')
elif idade >= 14 and idade <= 18:
    print('INFANTIL')    
elif idade == 19:
    print('JUNIOR')
elif idade == 20 :
    print('SÊNIOR')
else:
    print('MESTRE')






# Exercicio 42
'''refaça o DESAFIO 35 dos triângulos,
acrescentando o recurso de mostrar que 
tipo de triângulo será formado:

- Equilátero: todos os lados iguais
- Isósceles: dois lados iguais
- Escaleno: tosos os lados diferentes'''




# Exercicio 43
'''Desenvolva uma lógica que leia o peso e a altura de uma 
pessoa,calcule seu IMC e mostra seu status, de acordo com a tabela
abaixo:

- Abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25:peso ideal
- 25 ate 30: sobrepeso
- 30 até 40: obesidade
- Acima de 40:
obesidade mórbida'''

# peso = float(input('Digite seu peso: '))
# altura = float(input('Digite sua altura: '))
# imc = peso / (altura ** 2)
 
# print(f'Seu imc é {imc}')

# if imc <= 18.5:
#     print('Você está abaixo do peso!')
# elif imc >= 18.5 and imc <= 25 :
#     print('Você está no peso ideal!')    
# elif 25 <= imc <= 30:
#     print('Você está na obesidade!')     
# else:
#     print('obesidade mórbida')    


# Exercicio 44 
'''Elabore um programa que calcule o valor a ser
pago por produto,
considerando o seu preço normal e condição de pagamento:

- á vista dinheiro ceque:10% de desconto
- á vista no  cartão:5% de desconto
- em até 2x noi cartão:
preço normal
-3x ou mais no cartão:20% de juros'''

# Exercicio 45
''' Crie um programa que faça o 
computador jogar JOKENPÔ com você'''