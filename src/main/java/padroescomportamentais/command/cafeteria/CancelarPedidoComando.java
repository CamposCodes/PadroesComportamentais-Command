package padroescomportamentais.command.cafeteria;

public class CancelarPedidoComando implements Comando {

    private Pedido pedido;
    private Estoque estoque;

    public CancelarPedidoComando(Pedido pedido, Estoque estoque) {
        this.pedido = pedido;
        this.estoque = estoque;
    }

    @Override
    public void executar() {
        // Cancela pedido diretamente
        pedido.setSituacao("Pedido cancelado");
    }

    @Override
    public void cancelar() {
        // Reverte cancelamento
        pedido.setSituacao("Pedido feito");
    }
}