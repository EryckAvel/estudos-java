package S14.exercicio.produtos.entity;

public class ProdutoImportado extends Produto{

    protected Double taxaAlfandegaria;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double valorTotal(){
        return preco + taxaAlfandegaria;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nTipo: Importado" +
                "\nPreço: " + preco +
                "\nTaxa Alfandegaria: " + taxaAlfandegaria;
    }
}
