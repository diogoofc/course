"""
Formatação básica de strings
S - string
d - int 
f- float
.<número de dígitos>f
x ou x - hexadecimal
(caractere) (><^)(quantidade)
> - esquerda
< direita
^ centro
= - Força o número a aparecer antes dos zeros
Sinal - + ou -
EX.:0>-100,1f
conversion flags - !r !s !a
"""

variavel = 'ABC'
print(f'{variavel}')
print(f'{variavel: >10}')
print(f'{variavel: <10}')
print(f'{variavel: ^10}')
print(f'{10.000:.2f}')
print(f' O hexadecimal de 1500 {1500:08X}')