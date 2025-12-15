package padroescomportamentais.command.cafeteria;

public class FazerPedidoComando implements Comando {

    private Pedido pedido;
    private Estoque estoque;

    public FazerPedidoComando(Pedido pedido, Estoque estoque) {
        this.pedido = pedido;
        this.estoque = estoque;
    }

    @Override
    public void executar() {
        // Simula fazer pedido: decrementa estoque e marca pedido como feito
        estoque.setQuantidadeCafe(estoque.getQuantidadeCafe() - 1);
        estoque.setQuantidadeCerveja(estoque.getQuantidadeCerveja() - 1);
        pedido.setSituacao("Pedido feito");
    }

    @Override
    public void cancelar() {
        // Cancela: reverte estoque e marca pedido como cancelado
        estoque.setQuantidadeCafe(estoque.getQuantidadeCafe() + 1);
        estoque.setQuantidadeCerveja(estoque.getQuantidadeCerveja() + 1);
        pedido.setSituacao("Pedido cancelado");
    }
}