package src;

import java.util.*;

class Pedido {
    private static int contadorPedidos = 1;
    private int id;
    private Cliente cliente;
    private List<ItemMenu> items = new ArrayList<>();
    private double total;

    public Pedido(int i, Cliente cliente) {
        this.id = contadorPedidos++;
        this.cliente = cliente;
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public double getTotal() { return total; }

    public void adicionarItem(ItemMenu item) {
        items.add(item);
        calcularTotal();
    }

    private void calcularTotal() {
        total = items.stream().mapToDouble(ItemMenu::getPreco).sum();
    }

    public void exibirPedido() {
        System.out.println("\nResumo do Pedido #" + id + ":");
        for (ItemMenu item : items) {
            System.out.println("- " + item.getNome() + " - R$ " + item.getPreco());
        }
        System.out.println("Total: R$ " + total);
    }
}

