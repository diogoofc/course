valor_da_casa = float(input('Qual e o valor da casa? R$ '))
salario = float(input('Quanto você recebe por mês? R$  '))
anos = int(input('Quantos anos pretende paga a casa? '))
prestacao = valor_da_casa / (anos * 12)
minimo = salario * 30 / 100

print(f'Para paga uma casa de {valor_da_casa} em {anos} anos')
print(f'a prestação será de R${prestacao:.2f}')
if prestacao >= minimo:
    print('Seu empretimo foi negado!')
else:
    print('Seu empretimo foi aprovado!')

