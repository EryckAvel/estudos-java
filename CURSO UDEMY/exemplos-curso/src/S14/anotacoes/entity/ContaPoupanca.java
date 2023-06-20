package S14.anotacoes.entity;

public final class ContaPoupanca extends Conta{

    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo*taxaJuros;
    }

    //TODO Reescrita de um metodo da super classe sendo identificada pela anotação @Override
    //TODO No caso aqui reescrevemos da forma que nos e necessaria para essa classe ja que o saque para esse tipo de conta e diferente de uma conta normal
    @Override
    public final void saque(Double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "taxaJuros=" + taxaJuros +
                ", numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
