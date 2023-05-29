package S8.ex002.entity;

import javax.xml.namespace.QName;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProdutos(int qtd){
        quantidade += qtd;
    }

    public void removerProdutos(int qtd){
        quantidade -= qtd;
    }

    @Override
    public String toString() {
        return "Dados do Produto: " + nome + ", " +
                "$ " + String.format("%.2f", preco) + ", Total: " + String.format("%.2f",valorTotalEmEstoque());
    }
}
