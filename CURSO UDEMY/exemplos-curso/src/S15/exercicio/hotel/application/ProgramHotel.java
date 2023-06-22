package S15.exercicio.hotel.application;

import S15.exercicio.hotel.model.entity.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramHotel {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Reserva reserva;

        System.out.println("-------------- HOTEL --------------");
        System.out.print("Numero do quarto: ");
        Integer quarto = Integer.parseInt(entrada.nextLine());
        System.out.print("Check-in: ");
        LocalDate checkin = LocalDate.from(formatterDate.parse(entrada.nextLine()));
        System.out.print("Check-out: ");
        LocalDate checkout = LocalDate.from(formatterDate.parse(entrada.nextLine()));
        reserva = new Reserva(quarto, checkin, checkout);

        System.out.println("\n-------------- CADASTRO --------------");
        System.out.println(reserva);
    }

}
