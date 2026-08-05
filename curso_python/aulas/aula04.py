n1 = int(input('Digite um numero: '))
n2 = int(input('Digite outro numero: '))
s = n1 + n2
m = n1 * n2
d = n1 / n2
di = n1 // n2
e = n1 ** n2
print('A soma é {},\n o produto é {} \n e a divisãos é {:.3}'.format(s, m, d),)
print('Divisão inteira {} e potência {}'.format(di, e))