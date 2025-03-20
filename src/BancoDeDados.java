package src;

import java.util.*;

class BancoDeDados {
    private List<ItemMenu> cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public List<ItemMenu> carregarCardapio() {
        return cardapio;
    }

    public void salvarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido salvo com sucesso!");
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public void removerPedido(int id) {
        pedidos.removeIf(pedido -> pedido.getId() == id);
        System.out.println("Pedido removido com sucesso!");
    }
}
