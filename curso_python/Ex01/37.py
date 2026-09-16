numero = int(input('Qual número: '))
print('''Escolha uma das bases para conversão
[ 1 ] converter para binario
[ 2 ] converter para octal
[ 3 ] converter para hexadecimal''')
opcao = int(input('Sua opção: '))

if opcao == 1:
    binario = bin(numero) [2:]
    print(f'conversão do número {numero}  para binário', binario)
elif opcao == 2:
    octal = oct(numero) [2:]
    print(f'conversão do número {numero} para Octal', octal)
elif opcao == 3:
    hexadecimal = hex(numero)[2:]
    print(f'conversão do número {numero} Hexadecimal', hexadecimal)
else:
    print('Opção invalida! tenta novamente')