package S18.anotacao.locadora.forma1.model.forma1.model;

import java.time.LocalDateTime;

public class AluguelCarro {

    private LocalDateTime datainicio;
    private LocalDateTime datatermino;
    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime datainicio, LocalDateTime datatermino, Veiculo veiculo) {
        this.datainicio = datainicio;
        this.datatermino = datatermino;
        this.veiculo = veiculo;
    }

    public LocalDateTime getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDateTime datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDateTime getDatatermino() {
        return datatermino;
    }

    public void setDatatermino(LocalDateTime datatermino) {
        this.datatermino = datatermino;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public String toString() {
        return "AluguelCarro{" +
                "datainicio=" + datainicio +
                ", datatermino=" + datatermino +
                ", veiculo=" + veiculo +
                ", fatura=" + fatura +
                '}';
    }
}
