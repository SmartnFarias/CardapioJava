package src;

abstract class ItemMenu {
    protected String nome;
    protected String descricao;
    protected double preco;
    protected String imagemPath;

    public ItemMenu(String nome, String descricao, double preco, String imagemPath) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagemPath = imagemPath;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public String getImagemPath() { return imagemPath; }
}
