ano_de_nacimento = int(input('Digite seu ano de nacimento: '))
ano_atual = int(input('Digite ano atual: '))
idade =  ano_atual - ano_de_nacimento


if idade == 18:
    print(f'Você ta com {idade} anos!Ta na hora de se alistar ao serviço militar!')
elif idade < 18:
    soma = 18 - idade
    print(f'Você ta com {idade} anos! Ainda vai se alistar ao serviço militar!')
    print(f'Faltam {soma} anos! pra você se alistar!')
else:
    anos_passados =  idade - 18
    anos_de_alistamento = ano_atual - anos_passados
    print(f'Você ta com {idade} anos! ja se passou o tempo de se alistar ao serviço militar!')
    print(f'Era pra ter se alisatdo no ano de {anos_de_alistamento}')


