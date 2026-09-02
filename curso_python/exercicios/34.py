salario = float(input('Qual e o seu salario?'))

if salario > 1250:
    aumento = salario * 0.10
    novo_salario = salario + aumento
    print(f'O seu salario de R$ {salario} com aumento de 10% ficou {novo_salario:.2f}')
else:
    aumento = salario * 0.15
    novo_salario = salario + aumento
    print(f'O seu salario de R$ {salario} com aumento de 15% ficou {novo_salario:.2f}')