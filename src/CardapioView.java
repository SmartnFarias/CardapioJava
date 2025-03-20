package src;

import java.util.List;

class CardapioView {
    private List<ItemMenu> listaItens;
    private String descricaoArea;
    private String imagemLabel;

    public void atualizarDetalhes(ItemMenu item) {
        descricaoArea = item.getDescricao();
        imagemLabel = item.getImagemPath();
    }
}