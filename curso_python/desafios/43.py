seu_peso = float(input('Me fala o seu peso: '))
altura = float(input('Me fala o sua altura: '))
imc = seu_peso / (altura ** 2)

if imc < 18.5:
    print(f'pelo  seu IMC e pelo nosso analiser você ta Abaixo do peso {imc:.2f}')
elif imc >= 18.5 and imc < 25:
    print(f'pelo  seu IMC e pelo nosso analiser você ta no peso Ideal {imc:.2f}')
elif imc >= 25 and imc < 30:
    print(f'pelo  seu IMC e pelo nosso analiser você ta Sobrepeso {imc:.2f}')
elif imc >= 30 and imc < 40:
    print(f'pelo  seu IMC e pelo nosso analiser você ta na Obesidade {imc:.2f}')
else:
    print(f'pelo  seu IMC e pelo nosso analiser você ta na Obesidade móbida {imc:.2f}')


