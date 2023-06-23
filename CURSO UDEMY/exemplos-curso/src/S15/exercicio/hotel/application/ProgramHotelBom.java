package S15.exercicio.hotel.application;

import S15.exercicio.hotel.model.entity.Reserva;
import S15.exercicio.hotel.model.exception.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramHotelBom {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Reserva reserva;

        try {
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

            System.out.println();
            System.out.println("Atualizar datas de reserva:");
            System.out.print("Check-in: ");
            checkin = LocalDate.from(formatterDate.parse(entrada.nextLine()));
            System.out.print("Check-out: ");
            checkout = LocalDate.from(formatterDate.parse(entrada.nextLine()));

            reserva.atualizarDatasV3(checkin, checkout);
            System.out.println("\n-------------- ATUALIZACAO --------------");
            System.out.println(reserva);
        }catch(DomainException d){
            System.out.println("Erro em fazer a reserva:  " + d.getMessage());
        }

    }

}