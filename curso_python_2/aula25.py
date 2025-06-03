"""
Interpolação básica de strings
s - string
d e i - int
f - float
x e x - hexadecimal (ABCDEF0123456789)
"""

# nome = 'Diogo'
# preco = 1000.95897643
# variavel = '%s, o preço é R$%.2f' % (nome, preco)
# print(variavel)
# print('O  hexadecimal de %d é %08x' % (1500, 1500))





nome = input("Digite o nome do cliente: ")
idade = int(input("Digite a idade: "))
saldo = float(input("Digite o saldo da conta: "))
numero_cliente = int(input("Digite o número do cliente: "))

# Saída formatada usando interpolação
print("\n--- DADOS CADASTRADOS ---")
print("Cliente: %s" % nome)
print("Idade: %d anos" % idade)
print("Saldo: R$ %.2f" % saldo)
print("Número do cliente: %d (hex: %x)" % (numero_cliente, numero_cliente))
