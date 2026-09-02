r1 = int(input('Primeiro segmento: '))
r2 = int(input('Segundo segmento: '))
r3 = int(input('Terceiro segmento: '))

if r1 > r2 and r2 > r3 and r2 + r3 and r3 < r1 + r2:
    print('Os Segmentos acima PODER FORMAR triângulo')
else:
    print('Os Segmentos NÂO PODE FORMA triângulo')