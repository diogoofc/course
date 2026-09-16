menor_peso = 0
maior_peso = 0
for c in range(0,5):
    peso = float(input('Digite seus pesos: '))
    if c == 0:
        maior_peso = peso
        menor_peso = peso
    else:
        if peso > maior_peso:
            maior_peso = peso
        if peso < menor_peso:
            menor_peso = peso
print(f'Esse fio o Maior {maior_peso} peso e esse foi o  {menor_peso} menor peso')
