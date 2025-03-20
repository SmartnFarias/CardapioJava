package src;

class Bebida extends ItemMenu {
    private double volume;
    private boolean alcoolica;

    public Bebida(String nome, String descricao, double preco, String imagemPath, double volume, boolean alcoolica) {
        super(nome, descricao, preco, imagemPath);
        this.volume = volume;
        this.alcoolica = alcoolica;
    }

    public double getVolume() { return volume; }
    public boolean isAlcoolica() { return alcoolica; }
}
