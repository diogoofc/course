s = 0
for c in range(0, 6):
    num = int(input('Digite numero inteiro: '))
    if num % 2 == 0:
        s += num
print(f'A somas dos numero são {s}')