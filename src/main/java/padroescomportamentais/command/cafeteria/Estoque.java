package padroescomportamentais.command.cafeteria;

public class Estoque {

    private int quantidadeCafe;

    private int quantidadeCerveja;

    public Estoque(int quantidadeCafe, int quantidadeCerveja) {
        this.quantidadeCafe = quantidadeCafe;
        this.quantidadeCerveja = quantidadeCerveja;
    }

    public int getQuantidadeCafe() {
        return quantidadeCafe;
    }

    public void setQuantidadeCafe(int quantidadeCafe) {
        this.quantidadeCafe = quantidadeCafe;
    }

    public int getQuantidadeCerveja() {
        return quantidadeCerveja;
    }

    public void setQuantidadeCerveja(int quantidadeCerveja) {
        this.quantidadeCerveja = quantidadeCerveja;
    }
}