package src;

import java.util.*;

class Cardapio {
    private List<ItemMenu> itens = new ArrayList<>();

    public void adicionarItem(ItemMenu item) { itens.add(item); }
    public void removerItem(ItemMenu item) { itens.remove(item); }
    public List<ItemMenu> listarItens() { return itens; }

    public void exibirCardapio() {
        System.out.println("\n--- Cardápio ---");
        int index = 1;
        for (ItemMenu item : itens) {
            System.out.println(index + ". " + item.getNome() + " - R$ " + item.getPreco());
            index++;
        }
    }
}
