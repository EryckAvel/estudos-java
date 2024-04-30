package S18.excercicio.ex001.model;

import S18.excercicio.ex001.service.PagamentoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

    private LocalDate data;
    private double valor;
    private PagamentoService pagamento;


    public Parcela() {
    }

    public Parcela(LocalDate data, double valor, PagamentoService pagamento) {
        this.data = data;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PagamentoService getPagamento() {
        return pagamento;
    }

    public void setPagamento(PagamentoService pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + String.format("%.2f",valor);
    }
}
