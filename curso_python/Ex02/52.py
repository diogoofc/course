e_primo = True
n = int(input('Esse número e PRIMO: '))
for c in range(2,n):
    if n % c == 0:
        e_primo = False
if e_primo:
    print(f'{e_primo} {n} e primo')
else:
    print(f'{e_primo} {n} não e primo')






