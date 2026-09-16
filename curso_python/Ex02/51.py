primeiro_termo = int(input('Primeiro termo: '))
razao = int(input('razão: '))
decimo = primeiro_termo + (10 - 1) * razao
for c in range(primeiro_termo, decimo, razao):
    print(f'{c}', end= '-> ')
    primeiro_termo= primeiro_termo + razao
