package S13.anotacoes.entity;

import S13.anotacoes.enums.OrdemDeStatus;

import java.time.LocalDate;

public class Pedido {

    private Long id;
    private LocalDate moment;
    private OrdemDeStatus status;

    public Pedido() {
    }

    public Pedido(Long id, LocalDate moment, OrdemDeStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrdemDeStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemDeStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido de Id: " + id + ", gerado na data: " + moment + ", com o status: " + status;
    }
}
