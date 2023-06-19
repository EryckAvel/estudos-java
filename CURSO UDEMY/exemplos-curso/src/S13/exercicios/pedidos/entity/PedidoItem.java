package S13.exercicios.pedidos.entity;

public class PedidoItem {

    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public PedidoItem() {
    }

    public PedidoItem(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal(){
       return preco = quantidade*produto.getPreco();
    }

    @Override
    public String toString() {
        return "\n   - Quantidade : " + quantidade +
                "\n   - Total do Item : " + preco +
                "\n   - Produto : " + produto.getNome();

    }
}
