package S14.exercicio.funcionarios.entity;

public class FuncionarioTercerizado extends Funcionario{

    protected Double valorAdicional;

    public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double valorAdicional) {
        super(nome, horas, valorPorHora);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + (valorAdicional*1.1);
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nHoras: " + horas +
                "\nTercerizado: " + true +
                "\nDespesas Adicionais: " + valorAdicional +
                "\nValor do pagamento: " + pagamento();
    }
}
