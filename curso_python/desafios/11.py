salario_funcionario = float(input('Qual e o salario atual? '))
aumento = salario_funcionario * 0.15
salario_novo = salario_funcionario + aumento
print(f'O salario do funcionario é {salario_funcionario} reais com o aumento', end=' ')
print(f'de 15% vai ficar {salario_novo:.2f} reais')