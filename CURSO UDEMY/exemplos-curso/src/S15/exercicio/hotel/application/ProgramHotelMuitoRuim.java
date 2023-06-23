package S15.exercicio.hotel.application;

import S15.exercicio.hotel.model.entity.Reserva;
import S15.exercicio.hotel.model.exception.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramHotelMuitoRuim {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws DomainException {
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


            LocalDate agora = LocalDate.now();
            if (checkin.isBefore(agora) || checkout.isBefore(agora)){
                System.out.println("Erro em fazer a reserva: Data de checkout e checkin devem ser futuras!");
            }else if (!checkout.isAfter(checkin)){
                System.out.println("Erro em fazer a reserva: Data de checkout invalida!");
            } else{
                reserva.atualizarDatas(checkin, checkout);
                System.out.println("\n-------------- ATUALIZACAO --------------");
                System.out.println(reserva);
            }
        }
    }

}