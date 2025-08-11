package org.example.chap4.time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ExempleChronoUnit {

    public static void main(String[] args) {
        new ExempleChronoUnit().between();
    }

    void between() {
        var date = LocalDate.of(2022, Month.NOVEMBER, 6);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        ZonedDateTime zdt1 = ZonedDateTime.of(date, time, zone);
        ZonedDateTime zdt2 = zdt1.plus(1, ChronoUnit.HOURS);
        long between = ChronoUnit.HOURS.between(zdt1, zdt2);
        System.out.println(between);  //1
    }
}
