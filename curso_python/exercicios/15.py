from math import sqrt, pow
cateto_oposto = float(input('Digite o cateto oposto: '))
cateto_adjacente = float(input('Digite o cateto adjacente: '))
raiz = sqrt(pow(cateto_oposto,2) + pow(cateto_adjacente,2))
print(f'A hipotenusa e {raiz} ')
