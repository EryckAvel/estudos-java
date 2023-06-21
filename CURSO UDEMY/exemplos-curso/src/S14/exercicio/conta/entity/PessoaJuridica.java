package S14.exercicio.conta.entity;

public class PessoaJuridica extends Pessoa{

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double taxa() {
        Double taxa;
        if (numeroFuncionarios < 10){
            taxa = getRendaAnual()*0.16;
        }else {
            taxa = getRendaAnual()*0.14;
        }
        return taxa;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nRenda Anual: " + String.format("%.2f",rendaAnual) +
                "\nNumero de Funcionarios: " + numeroFuncionarios +
                "\nValor de Imposto: " + String.format("%.2f",taxa());
    }

}
