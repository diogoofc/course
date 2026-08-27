distancia = float(input('Qual e a distancia da viagem? '))
if distancia <= 200:
    preco = distancia * 0.50
    print(f'Sua viagem  de ate 200KM vai custar R${preco:.2f}')
else:
    preco = distancia * 0.45
    print(f'viagem  mais de 200KM vai custar R${preco:.2f}')
print('FIM')