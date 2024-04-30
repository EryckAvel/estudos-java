package S18.excercicio.ex001.model;

import java.time.LocalDate;
import java.util.List;

public class Contrato {

    private int numero;
    private LocalDate data;
    private double total;
    private List<Parcela> parcelas;

    public Contrato() {
    }

    public Contrato(int numero, LocalDate data, double total) {
        this.numero = numero;
        this.data = data;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

}
