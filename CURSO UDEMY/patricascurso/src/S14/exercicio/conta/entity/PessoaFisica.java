package S14.exercicio.conta.entity;

public class PessoaFisica extends Pessoa{

    private Double gastoComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public Double taxa() {
        Double taxa = null;
        if (rendaAnual < 20000.0){
            taxa = getRendaAnual() * 0.15;
        }else{
            taxa = getRendaAnual() *0.25;
        }
        taxa -= gastoComSaude*0.5;
        if (taxa < 0.0){
            taxa = 0.0;
        }
        return taxa;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nRenda Anual: " + String.format("%.2f",rendaAnual) +
                "\nGastos Medicos: " + String.format("%.2f",gastoComSaude) +
                "\nValor de Imposto: " + String.format("%.2f",taxa());
    }
}
