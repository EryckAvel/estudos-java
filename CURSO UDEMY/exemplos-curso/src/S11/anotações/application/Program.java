package S11.anotações.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o Teste que deseja realizar:");
        int num = Integer.parseInt(entrada.nextLine());
        switch (num) {
            case 1:
                //TODO FORMATADOR DE DATAS
                DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                //TODO TRABALHANDO APENAS COM A DATA DO DIA ATUAL
                LocalDate d01 = LocalDate.now();
                //TODO TRABALHANDO COM DATA E HORARIO DO DIA E MOMENTO ATUAL
                LocalDateTime d02 = LocalDateTime.now();
                //TODO TRABALAHANDO COM DATA E HORARIO DO FUSO HORARIO DE LONDRES QUE E PADRÃO
                Instant d03 = Instant.now();
                //TODO TRABALHANDO COM DATAS INSERIDAS E CONVERTENDO
                LocalDate d04 = LocalDate.parse("2022-07-20");
                //TODO TRABALHANDO COM DATA E HORA INSERIDA E CONVERTIDA PARA LOCALDATETIME
                LocalDateTime d05 = LocalDateTime.parse("2022-06-30T15:26:00");
                //TODO TRABALHANDO COM DATA E HORA INSERIDA E CONVERTIDA DEFININDO O FUSO
                Instant d06 = Instant.parse("2022-06-30T15:26:00Z");
                //TODO TRABALHANDO COMO DATA E HORA INSERIDA APARTIR DE UM FUSO EXPECIFICO
                Instant d07 = Instant.parse("2022-06-30T15:26:00-03:00");
                //TODO PERMITINDO UMA ENTRADA DE DADOS COSTUMAIZADA ATRAVES DO DATEFORMATER
                LocalDate d08 = LocalDate.parse("30/03/2003", f1);
                LocalDateTime d09 = LocalDateTime.parse("30/03/2003 20:30", f2);
                //TODO PASSANDO DADOS ISOLADOS TANTO COM DATA COMO COM DATA E HORA
                LocalDate d10 = LocalDate.of(2002, 5, 6);
                LocalDateTime d11 = LocalDateTime.of(2022, 1, 8, 5, 56);

                System.out.println("--------------------------------\n");
                System.out.println("Data Atual: " + d01);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora Atual: " + d02);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora no Z Fuso: " + d03);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data Inserida: " + d04);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Horario Inseridos: " + d05);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora com Fuso Inseridos: " + d06);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora com Fuso Exp Inserido: " + d07);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data formatada: " + d08);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora formatada: " + d09);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data com Dados Isolados: " + d10);
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora com Dados Isolados: " + d11);
                System.out.println("\n--------------------------------\n");
                System.out.println("Teste finalizado!");
                System.out.println("\n--------------------------------\n");
                break;
            case 2:
                LocalDate date = LocalDate.parse("2022-07-12");
                LocalDateTime  dateTime = LocalDateTime.parse("2022-07-30T20:26");
                Instant instant = Instant.parse("2022-07-20T01:30:26Z");
                DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                DateTimeFormatter formatterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
                DateTimeFormatter formatterIsoDateTime = DateTimeFormatter.ISO_DATE_TIME;
                DateTimeFormatter formatterIsoInstant = DateTimeFormatter.ISO_INSTANT;

                System.out.println("--------------------------------\n");
                System.out.println("Data Personalizada: " + date.format(formatterDate) + "\n");
                System.out.println("Data Personalizada 2: " + formatterDate.format(date) + "\n");
                System.out.println("Data Personalizada 3: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
                System.out.println("O que muda entre as versões e a forma que e feita!");
                System.out.println("\n--------------------------------\n");
                System.out.println("Data e Hora Personalizada: " + dateTime.format(formatterDateTime) + "\n");
                System.out.println("Data e Hora Personalizada 2: " + formatterDateTime.format(dateTime) + "\n");
                System.out.println("Data e Hora Personalizada 3: " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n");
                System.out.println("O que muda entre as versões e a forma que e feita!");
                System.out.println("\n--------------------------------\n");
                System.out.println("Date e Hora com Fuso Personalizado: " + formatterInstant.format(instant));
                System.out.println("\n--------------------------------\n");
                System.out.println("ISO_DATE_TIME: " + dateTime.format(formatterIsoDateTime) + "\n");
                System.out.println("ISO_INSTANT: " + formatterIsoInstant.format(instant));
                System.out.println("\n--------------------------------\n");
        }

    }

}
