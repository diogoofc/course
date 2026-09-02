num1 = int(input('digite um numero: '))
num2 = int(input('digite outro numero: '))
num3 = int(input('digite outro numero: '))

if num1 > num2 and num1 > num3:
    print(f'O numero {num1} e maior')
elif num2 > num1 and num2 > num3:
    print(f'O numero {num2} e maior')
else:
    print(f'O numero {num3} e maior')

if num1 < num2 and num1 < num3:
    print(f'O numero {num1} e o menor')
elif num2 < num1 and num2 < num3:
    print(f'O numero {num2} e o menor')
else:
    print(f'O numero {num3} e o menor')

