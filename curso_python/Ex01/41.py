ano_de_nacimento = int(input('Em que ano você naceu? '))
ano_atual = int(input('Ano atual? '))
idade = ano_atual - ano_de_nacimento

if  idade < 9:
    print(f'Você tem {idade} então ta na categoria MIRIN')
elif idade >= 9 and idade < 14:
    print(f'Você tem {idade}  então ta na categoria INFANTIL')
elif idade >= 14 and idade < 19:
    print(f'VocÊ tem {idade} então ta na categoria JUNIOR')
elif idade == 20:
    print(f'Você tem {idade} então ta na categoria SÊNIOR')
else:
    print(f'Você tem {idade} então ta na categoria MASTER')