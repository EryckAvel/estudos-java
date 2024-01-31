package S15.exercicio.hotel.application;

import S15.exercicio.hotel.model.entity.Reserva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramHotelRuim {

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
        if (!checkout.isAfter(checkin)){
            System.out.println("Erro em fazer a reserva: Data de checkout invalida!");
        }else {
            reserva = new Reserva(quarto, checkin, checkout);
            System.out.println("\n-------------- CADASTRO --------------");
            System.out.println(reserva);

            System.out.println();
            System.out.println("Atualizar datas de reserva:");
            System.out.print("Check-in: ");
            checkin = LocalDate.from(formatterDate.parse(entrada.nextLine()));
            System.out.print("Check-out: ");
            checkout = LocalDate.from(formatterDate.parse(entrada.nextLine()));

            String error = reserva.atualizarDatasV2(checkin, checkout);
            if (error != null){
                System.out.println(error);
            }else {
                System.out.println("\n-------------- ATUALIZACAO --------------");
                System.out.println(reserva);
            }

        }
    }

}