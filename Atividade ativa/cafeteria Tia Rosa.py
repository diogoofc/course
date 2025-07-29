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

    # Adicionar o produto na lista
    produtos.append(novo_produto)
    print("Produto cadastrado.\n")

# Mostra  os produtos que foram cadastrados
def listar_produtos():
    if len(produtos) == 0:
        print("Nenhum produto cadastrado.\n")
    else:
        i = 1
        for p in produtos:
            print(f"{i} - {p['nome']} - R${p['preco']}")
            print("Descrição:", p["descricao"])
            print()
            i += 1

# Onde ficam os clientes
clientes = []

# cadastrar um novo cliente
def cadastrar_cliente():
    nome = input("Nome do cliente: ")

    cliente = {
        "nome": nome
    }

    # Adiciona o cliente na lista
    clientes.append(cliente)
    print("Cliente cadastrado.\n")

# Mostra  os clientes que foram cadastrados
def listar_clientes():
    if len(clientes) == 0:
        print("Nenhum cliente cadastrado.\n")
    else:
        i = 1
        for c in clientes:
            print(f"{i} - {c['nome']}")
            i += 1
        print()

# Menu principal 
def menu():
    while True:
        # Opções do menu
        print("1 - Cadastrar produto")
        print("2 - Listar produtos")
        print("3 - Cadastrar cliente")
        print("4 - Listar clientes")
        print("5 - Sair")
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
            print("Saindo...")
            break
        else:
            print("Opção inválida.\n")

# menu pra começar o programa
menu()
