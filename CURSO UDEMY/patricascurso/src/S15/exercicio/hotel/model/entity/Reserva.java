package S15.exercicio.hotel.model.entity;

import S15.exercicio.hotel.model.exception.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private Integer numeroQuarto;
    private LocalDate checkin;
    private LocalDate checkout;
    DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, LocalDate checkin, LocalDate checkout) throws DomainException {
        if (!checkout.isAfter(checkin)){
            throw new DomainException("Data de checkout invalida!");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }


    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Long duracao(){
        Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        return duration.toDays();
    }

    public void atualizarDatas(LocalDate checkin, LocalDate checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String atualizarDatasV2(LocalDate checkin, LocalDate checkout){
        LocalDate agora = LocalDate.now();
        if (checkin.isBefore(agora) || checkout.isBefore(agora)){
            return "Erro em fazer a reserva: Data de checkout e checkin devem ser futuras!";
        }if (!checkout.isAfter(checkin)){
            return "Erro em fazer a reserva: Data de checkout invalida!";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    public void atualizarDatasV3(LocalDate checkin, LocalDate checkout) throws DomainException {
        LocalDate agora = LocalDate.now();
        if (checkin.isBefore(agora) || checkout.isBefore(agora)){
            throw new DomainException("Data de checkout e checkin devem ser futuras!");
        }if (!checkout.isAfter(checkin)){
            throw new DomainException("Data de checkout invalida!");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "\nReserva:" +
                "\nNumero do Quarto: " + numeroQuarto +
                "\nCheck-in: " + checkin.format(fdt) +
                "\nCheck-out: " + checkout.format(fdt) +
                "\nTempo de Estadia: " + duracao();
    }
}
