"""
Exercicio 
peça ao usuário para digita seu nome
peça ao usuário para digita sua idade
se nome e idade forem digitados:
     Exiba:
        seu nome é {nome}
        seu nome invertido é {nome invertido}
        seu nome contém (ou não) espaços
        seu nome tem {n} letras
        a primeira lentra do seu nome é {letra}
        a última letra do seu nome é {letra}
se nada for digitado em nome ou idade:
  Exiba "Desculpe,você deixou campos vazios."
"""

nome = input('Digite seu nome: ')
idade = input('Digite sua idade: ')

if nome and idade:
    print(f'Seu nome é {nome}')
    print(f'Seu nome invertido é {nome[::-1]}') 

    if " " in nome:
        print("Seu nome contém espaços.")
    else:
        print("Seu nome NÃO contém espaços.")

    print(f'Seu nome tem {len(nome)} letras')
    print(f'A primeira letra do seu nome é {nome[0]}')
    print(f'A ultima letra do seu nome é {nome[-1]}')

else:
    print('Descupa, você deixou campos vazio.')
        

 
