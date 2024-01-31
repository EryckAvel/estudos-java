package S11.anotações.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

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
                break;
            case 3:
                LocalDate dt01 = LocalDate.parse("2022-07-12");
                LocalDateTime  dt02 = LocalDateTime.parse("2022-07-30T20:26");
                Instant dt03 = Instant.parse("2022-07-20T01:30:26Z");
                System.out.println("--------------------------------\n");
                LocalDate r1 = LocalDate.ofInstant(dt03, ZoneId.systemDefault());
                System.out.println("Convetendo Data com Fuso Defautl:" + r1);
                System.out.println("\n--------------------------------\n");
                LocalDate r2 = LocalDate.ofInstant(dt03, ZoneId.of("Portugal"));
                System.out.println("Convertendo Data para o Fuso de Portugal :" + r2);
                System.out.println("\n--------------------------------\n");
                LocalDateTime r3 = LocalDateTime.ofInstant(dt03, ZoneId.systemDefault());
                System.out.println("Convertendo Data e Hora para Fuso Default:" + r3);
                System.out.println("\n--------------------------------\n");
                LocalDateTime r4 = LocalDateTime.ofInstant(dt03, ZoneId.of("Portugal"));
                System.out.println("Convertendo Data e Hora para Fuso de Portugal:" + r4);
                System.out.println("\n--------------------------------\n");
                System.out.println("Dia do dt01: " + dt01.getDayOfMonth());
                System.out.println("Mes do dt01: " + dt01.getMonthValue());
                System.out.println("Ano do dt01: " + dt01.getYear());
                System.out.println("\n--------------------------------\n");
                System.out.println("Dia do dt02: " + dt02.getDayOfMonth());
                System.out.println("Mes do dt02: " + dt02.getMonthValue());
                System.out.println("Ano do dt02: " + dt02.getYear());
                System.out.println("Hora do dt02: " + dt02.getHour());
                System.out.println("Minuto do dt02: " + dt02.getMinute());
                System.out.println("\n--------------------------------\n");
                break;
            case 4:
                LocalDate dtDate = LocalDate.parse("2022-07-12");
                LocalDateTime  dtTime = LocalDateTime.parse("2022-07-30T20:26");
                Instant dtInstant = Instant.parse("2022-07-20T01:30:26Z");

                System.out.println("--------------------------------\n");
                LocalDate pastWeekLD = dtDate.minusDays(7);
                LocalDate nextWeekLD = dtDate.plusDays(7);
                System.out.println("Dia da semana anterior: " + pastWeekLD);
                System.out.println("Dia da semana seguinte: " + nextWeekLD);
                System.out.println("\n--------------------------------\n");
                LocalDateTime pastWeekLDT = dtTime.minusDays(7);
                LocalDateTime nextWeekLDT = dtTime.plusDays(7);
                System.out.println("Dia da semana anterior com Hora: " + pastWeekLDT);
                System.out.println("Dia da semana seguinte com Hora: " + nextWeekLDT);
                System.out.println("\n--------------------------------\n");
                Instant pastWeekIns = dtInstant.minus(7, ChronoUnit.DAYS);
                Instant nextWeekIns = dtInstant.plus(7, ChronoUnit.DAYS);
                System.out.println("Dia da semana anterior com Hora e Fuso: " + pastWeekIns);
                System.out.println("Dia da semana seguinte com Hora e Fuso: " + nextWeekIns);
                System.out.println("\n--------------------------------\n");
                Duration t1 = Duration.between(pastWeekLDT, nextWeekLDT);
                System.out.println("Duração da semana passada com Horas para a semana seguinte: " + t1.toDays() + " dias!");
                System.out.println("Duração da semana passada com Horas para a semana seguinte: " + t1.toHours() + " horas!");
                System.out.println("Duração da semana passada com Horas para a semana seguinte: " + t1.toMinutes() + " horas!");
                System.out.println("\n--------------------------------\n");
                break;
            case 5:
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date y1 = sdf1.parse("25/03/2003");
                Date y2 = sdf2.parse("25/03/2003 23:30:10");
                Date now = new Date();

                System.out.println("--------------------------------\n");
                System.out.println("Formato Normal do Date: \n");
                System.out.println(y1);
                System.out.println(y2);
                System.out.println(now);
                System.out.println("\n--------------------------------\n");
                System.out.println("Formato de apenas Data: \n");
                System.out.println(sdf1.format(y1));
                System.out.println(sdf1.format(y2));
                System.out.println(sdf1.format(now));
                System.out.println("\n--------------------------------\n");
                System.out.println("Formato de apenas Data e Hora: \n");
                System.out.println(sdf2.format(y1));
                System.out.println(sdf2.format(y2));
                System.out.println(sdf2.format(now));
                System.out.println("\n--------------------------------\n");
                break;
            case 6:
                System.out.println("--------------------------------\n");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date d = Date.from(Instant.parse("2020-06-20T15:42:07Z"));
                System.out.println(sdf.format(d));
                System.out.println("\n--------------------------------\n");
                Calendar cal = Calendar.getInstance();
                cal.setTime(d);
                cal.add(Calendar.HOUR_OF_DAY, 1);
                d = cal.getTime();
                System.out.println(sdf.format(d));
                System.out.println("\n--------------------------------\n");
                cal.setTime(Date.from(Instant.now()));
                System.out.println("Ano: " + cal.get(Calendar.YEAR));
                System.out.println("Mes: " + obterNomeMes(cal.get(Calendar.MONTH)));
                System.out.println("Dia: " + cal.get(Calendar.DAY_OF_MONTH));
                System.out.println("Dia da Semana : " + obterNomeDiaSemana(cal.get(Calendar.DAY_OF_WEEK)));
                System.out.println(cal.get(Calendar.HOUR_OF_DAY) + " Horas");
                System.out.println(cal.get(Calendar.MINUTE) + " Minutos");
                System.out.println(cal.get(Calendar.SECOND) + " Segundos");
                System.out.println("\n--------------------------------\n");
                break;
            default:
                System.out.println("Teste Não encontrado " + LocalDateTime.now());
        }

    }

    public static String obterNomeMes(int mes)
    {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }

    public static String obterNomeDiaSemana(int dia)
    {
        String[] diaSemana = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
        return diaSemana[dia-1];
    }

}
