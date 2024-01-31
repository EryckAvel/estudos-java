package S14.exercicio.produtos.entity;

import java.time.LocalDate;

public class ProdutoUsado extends Produto{

    protected LocalDate dataDeFacricacao;

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, Double preco, LocalDate ataDeFacricacao) {
        super(nome, preco);
        this.dataDeFacricacao = ataDeFacricacao;
    }

    public LocalDate getDataDeFacricacao() {
        return dataDeFacricacao;
    }

    public void setDataDeFacricacao(LocalDate dataDeFacricacao) {
        this.dataDeFacricacao = dataDeFacricacao;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nTipo: Usado" +
                "\nPreço: " + preco +
                "\nData de Fabricação: " + dataDeFacricacao;
    }
}
