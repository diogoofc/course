usuario = input('Digite um número: ')

try:
    numero_int = int(usuario)
    print(f'Você digitou {numero_int}')
except:
    print('Isso não e um número')