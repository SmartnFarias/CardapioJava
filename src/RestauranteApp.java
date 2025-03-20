package src;

import java.util.*;

public class RestauranteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        BancoDeDados bancoDeDados = new BancoDeDados();

        // Adicionando itens ao cardápio
        cardapio.adicionarItem(new Prato("Hambúrguer", "Pão, carne e queijo", 15.0, "burger.jpg"));
        cardapio.adicionarItem(new Prato("Pizza", "Mussarela e tomate", 30.0, "pizza.jpg"));
        cardapio.adicionarItem(new Bebida("Coca-Cola", "Refrigerante", 5.0, "coca.jpg", 350, false));
        cardapio.adicionarItem(new Bebida("Cerveja", "Bebida alcoólica", 8.0, "cerveja.jpg", 500, true));

        System.out.println("Bem-vindo ao restaurante!");

        // Cadastro do cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, telefone);
        Pedido pedido = new Pedido(0, cliente);

        boolean continuar = true;
        while (continuar) {
            cardapio.exibirCardapio();
            System.out.print("Escolha um item pelo número (ou 0 para finalizar): ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            List<ItemMenu> itens = cardapio.listarItens();
            if (escolha > 0 && escolha <= itens.size()) {
                pedido.adicionarItem(itens.get(escolha - 1));
                System.out.println(itens.get(escolha - 1).getNome() + " adicionado ao pedido.");
            } else if (escolha == 0) {
                continuar = false;
            } else {
                System.out.println("Escolha inválida.");
            }
        }

        pedido.exibirPedido();
        bancoDeDados.salvarPedido(pedido);

        // Exibir todos os pedidos
        System.out.println("\nPedidos no banco de dados:");
        for (Pedido p : bancoDeDados.listarPedidos()) {
            System.out.println("Pedido #" + p.getId() + " - Cliente: " + p.getCliente().getNome() + " - Total: R$ " + p.getTotal());
        }

        // Remover um pedido
        System.out.print("\nDeseja remover um pedido? Digite o ID ou 0 para sair: ");
        int idRemover = scanner.nextInt();
        if (idRemover != 0) {
            bancoDeDados.removerPedido(idRemover);
        }

        System.out.println("Obrigado por seu pedido, " + cliente.getNome() + "!");
        scanner.close();
    }
}
