package S14.anotacoes.abstracao.conta.entity;

public class ContaEmpresarial extends Conta{

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteSaque) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteSaque;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }


    //todo utilizamos o super para chamar dados da classe superior extendida
    //todo No exemplo a seguir estamos aproveirando ja o metodo de saque da classe conta que estamos extendendo
    @Override
    public void saque(Double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }

    public void emprestimo(Double valor){
        if (valor <= limiteEmprestimo) {
            saldo = valor - 10;
        }
    }

    @Override
    public String toString() {
        return "ContaEmpresarial{" +
                "limiteEmprestimo=" + limiteEmprestimo +
                ", numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
