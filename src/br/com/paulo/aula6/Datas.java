package br.com.paulo.aula6;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);

        int ano = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(ano);

        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo);
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());

        System.out.println(hoje.minusYears(1));
        System.out.println(hoje.minusMonths(4));
        System.out.println(hoje.minusDays(2));

        System.out.println(hoje.plusYears(1));
        System.out.println(hoje.plusMonths(4));
        System.out.println(hoje.plusDays(2));

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(proximasOlimpiadas.format(formatadorData));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        DateTimeFormatter formatodorDiasHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(agora.format(formatodorDiasHoras));

        YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
        System.out.println(anoEMes);

        System.out.println("-----------------------------------------------------");

        LocalDate anoFuturo = LocalDate.of(20199, Month.JANUARY, 25);

        Period periodoFuturo = Period.between(hoje, anoFuturo);

        System.out.println(hoje.format(formatadorData));

    }
}
