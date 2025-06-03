# if / elif    / else
# se / se não  / se não
# entrada = input('Você quer "entra" ou "sair"? ')


# if entrada == 'entrar':
#     print('Você entrou no sistema')
# elif entrada == 'sair':
#     print('Você saiu do sistema')
# else:
#     print('Você não digitou nem entra e nem sair.')    





peso = float(input('Digite seu peso: '))
altura = float(input('Digite seu altura: '))
imc = peso /(altura ** 2)

if imc  <= 15.5 :
    print('você esta a baixo do peso.')
elif imc == 18.5 :
    print('Você esta no peso normal.')   
else:
    print('Você esta na obesidade.')    
