nota_do_aluno1 = float(input('Primeira nota: '))
nota_do_aluno2 = float(input('Segunda nota: '))
media_do_aluno = (nota_do_aluno1 + nota_do_aluno2) / 2

if media_do_aluno < 5:
    print(f'Sua média fio {media_do_aluno} então Você foi reprovado!')
elif media_do_aluno >= 5 and media_do_aluno < 6.9:
    print(f'Sua média fio {media_do_aluno} então Você ficou de recuperação')
else:
    print(f'Sua média fio {media_do_aluno} então Você foi aprovado!')
