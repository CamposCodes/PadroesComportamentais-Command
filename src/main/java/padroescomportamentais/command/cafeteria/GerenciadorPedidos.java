package padroescomportamentais.command.cafeteria;

import java.util.Stack;

public class GerenciadorPedidos {

    private Stack<Comando> comandosExecutados = new Stack<>();

    public void executarComando(Comando comando) {
        comando.executar();
        comandosExecutados.push(comando);
    }

    public void cancelarUltimoComando() {
        if (!comandosExecutados.isEmpty()) {
            Comando comando = comandosExecutados.pop();
            comando.cancelar();
        }
    }
}