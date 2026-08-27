valor_da_casa = float(input('Qual e o valor da casa? R$ '))
salario = float(input('Quanto você recebe por mês? R$  '))
anos = int(input('Quantos anos pretende paga a casa? '))

meses = anos * 12
pagamento = valor_da_casa  / meses

if pagamento > salario * 0.30:
    print('Seu empretimo foi negado!')

else:
    print('Seu empretimo foi aprovado!')

