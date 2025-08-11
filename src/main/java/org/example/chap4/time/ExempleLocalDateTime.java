package org.example.chap4.time;

import java.time.*;

/**
 * La classe LocalDateTime de l'API de date et heure (java.time) est utilisée pour représenter une date et une heure sans
 * fuseau horaire. Elle combine les fonctionnalités de LocalDate et LocalTime pour fournir une manière moderne et complète de gérer les dates et heures.
 *
 */
public class ExempleLocalDateTime {

    public static void main(String[] args) {
        ExempleLocalDateTime useOfLocalDateTime = new ExempleLocalDateTime();
        useOfLocalDateTime.now();
        useOfLocalDateTime.createLocalDateTime();
    }

    void now() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(date);  //2023-10-21
        System.out.println(time); //22:45:09.164355
        System.out.println(dateTime); //2023-10-21T22:45:09.164446  (mind the T)
        System.out.println(zonedDateTime); //2023-10-21T22:45:09.165079+02:00[Europe/Zurich] (mind the timezone)
    }

    void createLocalDateTime() {
        LocalDateTime now = LocalDateTime.now();

        //with month as an int
        LocalDateTime ldtFullWithNS = LocalDateTime.of(2023, 11, 10, 10, 20, 10, 100);
        LocalDateTime ldtFull = LocalDateTime.of(2023, 11, 10, 10, 20, 10);
        LocalDateTime ldtNoSec = LocalDateTime.of(2023, 11, 10, 10, 10);

        //with month as an enum Month
        LocalDateTime ldtMonthEnumWithNS = LocalDateTime.of(2023, Month.NOVEMBER, 10, 10, 10, 10, 1);
        LocalDateTime ldtMonthEnum = LocalDateTime.of(2023, Month.NOVEMBER, 10, 10, 10, 10);
        LocalDateTime ldtMonthEnumNoSec = LocalDateTime.of(2023, Month.NOVEMBER, 10, 10, 10);

        LocalDateTime ldtComposed = LocalDateTime.of(LocalDate.now(),
                LocalTime.now());
        System.out.println(ldtComposed);
    }

    void ofEpochSecond() {
        ZoneOffset zurichOffset = ZoneOffset.ofHours(2);

        //Keep in mind that System.currentTimeMillis() returns ms, while the method expects seconds
        LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0,
                zurichOffset);
        System.out.println(ofEpochSecond); //2023-10-22T03:41:27
    }

    void with() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);  //2024-01-06T07:04:54.162247
        LocalDateTime ldt = now.with(DayOfWeek.MONDAY);
        System.out.println(ldt);  //2024-01-01T07:04:54.162247 ..I guess the prev monday
    }
}
