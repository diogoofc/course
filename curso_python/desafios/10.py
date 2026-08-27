preco_produto = float(input('Digite o valor do produto: '))
desconto = preco_produto * 0.05
novo_preco = preco_produto - desconto
print(f'Esse produto custa {preco_produto} e com 5% de desconto fica {novo_preco:.2f}')