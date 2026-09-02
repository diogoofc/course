num1 = int(input('Digite um numero: '))
num2 = int(input('Digite outro numero: '))
print('''======== Qual OPERAÇÂO que fazer ========
      [1] Somar
      [2] Subtração
      [3] Multiplicar
      [4] Dividir                 
=========================================''')

opcao = int(input('Qual e sua opção: '))
if opcao == 1:
    soma = num1 + num2
    print(f'A soma entre {num1} + {num2} = {soma:.1f}')
elif opcao == 2:
    sub = num1 - num2
    print(f'A subtração entre {num1} - {num2} = {sub:.1f}')
elif opcao == 3:
    mult = num1 * num2
    print(f'A Multiplicação entre {num1} * {num2} = {mult:.1f}')
elif opcao == 4:
    if num2 == 0:
        print('Não é possível dividir por zero')
    else:
        div = num1 / num2
        print(f'A divisão entre {num1} / {num2} = {div:.1f}')


