package S18.anotacao.locadora.forma1.model.forma1.services;

import S18.anotacao.locadora.forma1.model.forma1.model.AluguelCarro;
import S18.anotacao.locadora.forma1.model.forma1.model.Fatura;

import java.time.Duration;

public class AluguelService {

    private double precoPorHora;
    private double precoPorDia;

    private TaxaBrazileiraService taxa;

    public AluguelService(double precoPorHora, double precoPorDia, TaxaBrazileiraService taxa) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxa = taxa;
    }

    public void processarFatura(AluguelCarro aluguelCarro){
        double minutos = Duration.between(aluguelCarro.getDatainicio(), aluguelCarro.getDatatermino()).toMinutes();
        double horas = minutos/60.0;
        double pagamentobasico;
        if (horas <= 12){
            pagamentobasico = precoPorHora * Math.ceil(horas);
        }else{
            pagamentobasico = precoPorDia * Math.ceil(horas/24.0);
        }
        double valortaxa = taxa.taxa(pagamentobasico);
        aluguelCarro.setFatura(new Fatura(pagamentobasico, valortaxa));
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public TaxaBrazileiraService getTaxa() {
        return taxa;
    }

    public void setTaxa(TaxaBrazileiraService taxa) {
        this.taxa = taxa;
    }
}
