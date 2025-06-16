"""
Operadaores lógicos (or)
 
and (e) , or (ou) , not (não)
or - Qualquer condições verdadeira avalia
todas a expressão como verdadeira.
Se qualquer valor for considerado verdadeiro,
a expressão  inteira será avaliada naquele valor
São considerados falsy  (que você já viu)
00.0 '' false
Tambem existe o tipo None que é 
usado para representar um não valor
""" 

entrada = input('[E]ntra  [S]air: ')
senha_digitada = input('senha: ') 

senha_permitida = '123456'

# if condicao: o if so vai se executado se a execursao for verdadeira true:
if (entrada == 'E' or entrada == 'e') and senha_digitada == senha_permitida:
    print('Entrar')
else:
    print('Sair')    


# Avaliação de curto circuito
# senha = input('Senha: ') or 'sem senha'
# print(senha)