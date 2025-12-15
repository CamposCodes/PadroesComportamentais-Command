package padroescomportamentais.command.cafeteria;

public class Pedido {

    private String situacao;

    public Pedido() {
        this.situacao = "Pendente";
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}