# CardapioJava

+--------------------+
|      ItemMenu     |  (Superclasse)
+--------------------+
| - nome: String    |
| - descricao: String |
| - preco: double   |
| - imagemPath: String |
+--------------------+
| + getNome(): String |
| + getDescricao(): String |
| + getPreco(): double |
| + getImagemPath(): String |
+--------------------+

        ↑
        | (Herança)
        |  
+--------------------+       +--------------------+
|      Prato        |       |      Bebida       |
+--------------------+       +--------------------+
| (Sem mudanças)    |       | - volume: double  |
|                   |       | - alcoolica: boolean |
+--------------------+       +--------------------+
| (Métodos de Prato)|       | + isAlcoolica(): boolean |
+--------------------+       +--------------------+

        |
        | (1..*) Um cardápio pode conter vários pratos e bebidas
        v

+--------------------+
|     Cardapio      |
+--------------------+
| - pratos: List<Prato> |
| - bebidas: List<Bebida> |
+--------------------+
| + adicionarPrato(prato: Prato) |
| + removerPrato(prato: Prato) |
| + adicionarBebida(bebida: Bebida) |
| + removerBebida(bebida: Bebida) |
| + listarItens(): List<ItemMenu> |
+--------------------+

        |
        | (1..*) Um pedido pode ter vários pratos e bebidas
        v

+--------------------+
|      Pedido       |
+--------------------+
| - id: int        |
| - cliente: Cliente |
| - itens: List<ItemMenu> |
| - total: double  |
+--------------------+
| + adicionarItem(item: ItemMenu) |
| + calcularTotal(): double |
| + getCliente(): Cliente |
+--------------------+

        |
        | (1) Feito por um cliente
        v

+--------------------+
|      Cliente      |
+--------------------+
| - nome: String    |
| - email: String   |
| - telefone: String |
+--------------------+
| + getNome(): String |
| + getEmail(): String |
| + getTelefone(): String |
+--------------------+

        |
        | (1) Cliente acessa a interface gráfica
        v

+--------------------+
|    CardapioView   |
+--------------------+
| - listaItens: JList<ItemMenu> |
| - descricaoArea: JTextArea |
| - imagemLabel: JLabel |
+--------------------+
| + atualizarDetalhes(item: ItemMenu) |
+--------------------+

        |
        | (1) Está dentro da Janela Principal
        v

+--------------------+
|     MainFrame     |
+--------------------+
| - cardapioView: CardapioView |
+--------------------+
| + iniciarApp()    |
+--------------------+

        |
        | (1) Consulta o banco de dados
        v

+--------------------+
|   BancoDeDados    |
+--------------------+
| + carregarCardapio(): List<ItemMenu> |
| + salvarPedido(pedido: Pedido) |
+--------------------+
