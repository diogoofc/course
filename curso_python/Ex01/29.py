velocidade_do_carro = int(input('Qual a velocidade do carro? '))
if velocidade_do_carro > 80:
    multa = (velocidade_do_carro - 80) * 7
    print(f'Você foi multado! sua multa foi de R${multa:.2f}')
else:
    print(f'{velocidade_do_carro} KM certo você ta na velocidade da via! Continua assim')