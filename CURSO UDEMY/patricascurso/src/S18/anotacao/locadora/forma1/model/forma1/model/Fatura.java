package S18.anotacao.locadora.forma1.model.forma1.model;

public class Fatura {

    private Double valor;
    private Double taxa;
    private Double valortotal;

    public Fatura() {
    }

    public Fatura(Double valor, Double taxa) {
        this.valor = valor;
        this.taxa = taxa;
        calcularValorTotal();
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getValortotal() {
        return valortotal;
    }

    private void calcularValorTotal(){
        this.valortotal = valor + taxa;
    }

}
