numero = int(input('Qual número: '))
opcao = int(input('1-binaria \n 2-octal \n 3-Hexadecimal \n'))

if opcao == 1:
    binario = bin(numero)
    print(f'conversão do número {numero}  para binário', binario)
elif opcao == 2:
    octal = oct(numero)
    print(f'conversão do número {numero} para Octal', octal)
elif opcao == 3:
    hexadecimal = hex(numero)
    print(f'conversão do número {numero} Hexadecimal', hexadecimal)
else:
    print('Opção invalida! tenta novamente')