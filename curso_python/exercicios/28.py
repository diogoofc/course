import random

computador = random.randint(0,5)
usuario = int(input('Tenta acerta o numero de 0 ate 5? '))

if usuario == computador:
    print('Parabêns você acertou')
    print('FIM')
else:
    print('errou! tenta novamente')


