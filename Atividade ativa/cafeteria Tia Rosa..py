# Onde ficam os  produtos
produtos = []

# cadastros de  um  produtos novo
def cadastrar_produto():
    nome = input("Nome do produto: ")
    preco = float(input("Preço do produto: "))
    descricao = input("Descrição do produto: ")

# dados do produtos
    novo_produto = {
        "nome": nome,
        "preco": preco,
        "descricao": descricao
    }

    produtos.append(novo_produto)
    print("Produto cadastrado com sucesso.\n")

# Mostra  os produtos que foram cadastrados
def listar_produtos():
    if len(produtos) == 0:
        print("Nenhum produto cadastrado.\n")
    else:
        for i, p in enumerate(produtos, 1):
            print(f"{i} - {p['nome']} - R${p['preco']}")
            print("Descrição:", p["descricao"])
            print()

# Onde ficam os clientes
clientes = []

# cadastrar um novo cliente
def cadastrar_cliente():
    nome = input("Nome do cliente: ")
    cliente = {"nome": nome}
    clientes.append(cliente)
    print("Cliente cadastrado com sucesso.\n")

# Mostra  os clientes que foram cadastrados
def listar_clientes():
    if len(clientes) == 0:
        print("Nenhum cliente cadastrado.\n")
    else:
        for i, c in enumerate(clientes, 1):
            print(f"{i} - {c['nome']}")
        print()

# Onde ficam os pedidos
pedidos = []

# cadastrar um novo pedido
def fazer_pedido():
    if len(clientes) == 0:
        print("Nenhum cliente cadastrado.\n")
        return
    if len(produtos) == 0:
        print("Nenhum produto cadastrado.\n")
        return

    # Escolher cliente
    print("Escolha o cliente:")
    for i, c in enumerate(clientes):
        print(f"{i + 1} - {c['nome']}")
    cliente_idx = int(input("Número do cliente: ")) - 1
    cliente = clientes[cliente_idx]

    carrinho = []
    total = 0


    while True:
        print("Escolha o produto (0 para finalizar):")
        for i, p in enumerate(produtos):
            print(f"{i + 1} - {p['nome']} - R${p['preco']}")
        escolha = int(input("Número do produto: "))

        if escolha == 0:
            break

        if escolha < 1 or escolha > len(produtos):
            print("Número inválido. Tente de novo.\n")
            continue

        produto = produtos[escolha - 1]
        carrinho.append(produto)
        total += produto["preco"]
        print("Produto adicionado ao pedido.\n")

   
    if len(carrinho) == 0:
        print("Nenhum produto foi escolhido.\n")
        return

    # Criando o pedido
    pedido = {
        "cliente": cliente["nome"],
        "produtos": [p["nome"] for p in carrinho],
        "total": total
    }

    pedidos.append(pedido)
    print("Pedido feito com sucesso!\n")

#  Mostra os pedidos que foram cadastrados
def listar_pedidos():
    if len(pedidos) == 0:
        print("Nenhum pedido foi feito ainda.\n")
    else:
        for i, p in enumerate(pedidos, 1):
            print(f"{i} - Cliente: {p['cliente']}")
            print("Produtos:")
            for item in p["produtos"]:
                print(f" - {item}")
            print(f"Total: R${p['total']:.2f}\n")

# Menu do sistema
def menu():
    while True:
        print("1 - Cadastrar produto")
        print("2 - Listar produtos")
        print("3 - Cadastrar cliente")
        print("4 - Listar clientes")
        print("5 - Fazer pedido")
        print("6 - Listar pedidos")
        print("7 - Sair")
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            cadastrar_produto()
        elif opcao == "2":
            listar_produtos()
        elif opcao == "3":
            cadastrar_cliente()
        elif opcao == "4":
            listar_clientes()
        elif opcao == "5":
            fazer_pedido()
        elif opcao == "6":
            listar_pedidos()
        elif opcao == "7":
            print("Saindo...")
            break
        else:
            print("Opção inválida. Tente de novo.\n")

# Chama o menu pra iniciar o programa

menu()
