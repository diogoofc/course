from datetime import datetime

ano_atual = datetime.now().year
menor = 0
maior = 0
for c in range(0, 7):
    ano_de_nascimento = int(input('Digite o ano de nascimento: '))
    idade = ano_atual - ano_de_nascimento
    if idade > 21:
        maior = maior + 1
    else:
        menor = menor + 1
print(f'Dessas 7 pessoas {maior} são de  maior idade é {menor} são de menor  idade')