package S14.anotacoes.entity;

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

    public void emprestimo(Double valor){
        if (valor <= limiteEmprestimo) {
            saldo = valor - 10;
        }
    }

}
