Classe: BancoDeDados

Atributos:

Private - field: type
Métodos:

Private - carregarCardapio(): List<ItemMenu>
Private - salvarPedido(pedido: Pedido)
Classe: ItemMenu

Atributos:

Public - nome: String
Public - descricao: String
Public - preco: double
Public - imagemPath: String
Métodos:

Private - getNome(): String
Private - getDescricao(): String
Private - getPreco(): double
Private - getImagemPath(): String
Classe: Prato (Herança de ItemMenu)

Atributos:

Public - nome: String
Public - descrição: String
Public - preço: double
Public - imagemPath: String
Métodos:

Private - getNome(): String
Private - getDescricao(): String
Private - getPreco(): double
Private - getImagemPath(): String
Classe: Bebida (Herança de ItemMenu)

Atributos:

Public - volume: double
Public - alcoolica: boolean
Métodos:

Private - isAlcoolica(): boolean
Classe: Cardapio

Atributos:

Public - pratos: List<Prato>
Public - bebidas: List<Bebida>
Métodos:

Private - adicionarPrato(prato: Prato)
Private - removerPrato(prato: Prato)
Private - adicionarBebida(bebida: Bebida)
Private - removerBebida(bebida: Bebida)
Private - listarItens(): List<ItemMenu>
Classe: Pedido

Atributos:

Public - id: int
Public - cliente: Cliente
Public - items: List<Prato>
Public - total: double
Métodos:

Private - adicionarItem(item: ItemMenu)
Private - calcularTotal(): double
Private - getCliente(): Cliente
Classe: Cliente

Atributos:

Public - nome: String
Public - email: String
Public - telefone: String
Métodos:

Private - getNome(): String
Private - getEmail(): String
Private - getTelefone(): String
Classe: MainFrame

Atributos:

Public - cardapioView: CardapioView
Métodos:

Private - iniciarApp()
Classe: CardapioView

Atributos:

Public - listaItens: JList<ItemMenu>
Public - descricaoArea: JTextArea
Public - imagemLabel: JLabel
Métodos:

Private - atualizarDetalhes(item: ItemMenu)
