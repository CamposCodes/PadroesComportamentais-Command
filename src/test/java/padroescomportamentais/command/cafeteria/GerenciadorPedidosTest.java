package padroescomportamentais.command.cafeteria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GerenciadorPedidosTest {

    GerenciadorPedidos gerenciador;
    Pedido pedido;
    Estoque estoque;

    @BeforeEach
    void setUp() {
        gerenciador = new GerenciadorPedidos();
        pedido = new Pedido();
        estoque = new Estoque(10, 10);
    }

    @Test
    void deveFazerPedido() {
        Comando fazerPedido = new FazerPedidoComando(pedido, estoque);
        gerenciador.executarComando(fazerPedido);

        assertEquals("Pedido feito", pedido.getSituacao());
        assertEquals(9, estoque.getQuantidadeCafe());
        assertEquals(9, estoque.getQuantidadeCerveja());
    }

    @Test
    void deveCancelarPedido() {
        Comando cancelarPedido = new CancelarPedidoComando(pedido, estoque);
        gerenciador.executarComando(cancelarPedido);

        assertEquals("Pedido cancelado", pedido.getSituacao());
    }

    @Test
    void deveAtualizarEstoque() {
        Comando atualizarEstoque = new AtualizarEstoqueComando(estoque, 15, 15);
        gerenciador.executarComando(atualizarEstoque);

        assertEquals(15, estoque.getQuantidadeCafe());
        assertEquals(15, estoque.getQuantidadeCerveja());
    }

    @Test
    void deveCancelarUltimoComando() {
        Comando fazerPedido = new FazerPedidoComando(pedido, estoque);
        Comando cancelarPedido = new CancelarPedidoComando(pedido, estoque);

        gerenciador.executarComando(fazerPedido);
        gerenciador.executarComando(cancelarPedido);

        gerenciador.cancelarUltimoComando();

        assertEquals("Pedido feito", pedido.getSituacao());
    }
}