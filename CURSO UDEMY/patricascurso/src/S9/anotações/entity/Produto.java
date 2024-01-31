package S9.anotações.entity;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    //TODO PRIVATE = IMPEDE QUE OUTRAS CLASSES USEM, SENDO USADOS APENAS NAS CLASSES QUE FORAM DECLARADOS
    //TODO DEFAULT = QUANDO N DEFINIMOS O TIPO NA HORA DA DECLARAÇÃO, EM RESUMO ELA SE TORNA PUBLICA E ACESSIVEL PARA CLASSES DENTRO DO SEU PACOTE RAIZ
    //TODO PROTECTED = SO PODE SER ACESSADO NO MESMO PACOTE OU EM SUBCLASSES DE PACOTES DIFERENTES
    //TODO PUBLIC = LIVERADO PARA QUALQUER ACESSO

    //TODO UM CONSTRUTOR VAZIO NÃO OBRIGA QUE SEJA NECESSARIO A INSTACIAÇÃO DOS ATRIBUTOS NA CHAMADA
    public Produto() {
    }

    //TODO EXEMPLO DE SOBRECARGA
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //TODO CONSTRUTOR AONDE DEFINIMOS A OBRIGATORIEDADE DE PASSAGEM DE DADOS
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        //TODO A PALAVRA THIS E UMA REFERENCIA AO PROPIO OBJETO QUE NO CASO SERIA OS ATRIBUTOS
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProdutos(int qtd){
        quantidade += qtd;
    }

    public void removerProdutos(int qtd){
        quantidade -= qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Dados do Produto: " + nome + ", " +
                "$ " + String.format("%.2f", preco) + ", Total: " + String.format("%.2f",valorTotalEmEstoque());
    }
}
