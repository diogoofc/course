# Operadores lógicos
# and (e) or (ou) not (não)
# and - todas as condições precisam ser verdadeiras


entrada = input('[E]ntrar  [S]air: ')
senha_digitada = input('senha: ')

senha_permitida = 'Diogo2003'

if (entrada == 'E' or entrada == 'e') and senha_digitada == senha_permitida:
    print('Acesso permitido')
else:
    print('Senha incorreta! tente novamente')