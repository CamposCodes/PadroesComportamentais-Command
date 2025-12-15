package padroescomportamentais.command.cafeteria;

public class AtualizarEstoqueComando implements Comando {

    private Estoque estoque;
    private int quantidadeCafeAnterior;
    private int quantidadeCervejaAnterior;

    public AtualizarEstoqueComando(Estoque estoque, int novaQuantidadeCafe, int novaQuantidadeCerveja) {
        this.estoque = estoque;
        this.quantidadeCafeAnterior = estoque.getQuantidadeCafe();
        this.quantidadeCervejaAnterior = estoque.getQuantidadeCerveja();
        estoque.setQuantidadeCafe(novaQuantidadeCafe);
        estoque.setQuantidadeCerveja(novaQuantidadeCerveja);
    }

    @Override
    public void executar() {
        // Já executado no construtor para simplicidade
    }

    @Override
    public void cancelar() {
        // Reverte para quantidades anteriores
        estoque.setQuantidadeCafe(quantidadeCafeAnterior);
        estoque.setQuantidadeCerveja(quantidadeCervejaAnterior);
    }
}