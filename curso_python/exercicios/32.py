qual_ano = int(input('Qual e o ano ?'))
if qual_ano % 4 == 0  and qual_ano % 100 != 0 or qual_ano % 400 == 0:
    print(f"o ano {qual_ano} e bissexto")
else:
    print(f'O ano {qual_ano} Não e bissexto')

