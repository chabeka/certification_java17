package org.example.chap4.time;

import java.time.*;
import java.util.Set;

/**
 * ZonedDateTime est une classe en Java qui fait partie du package java.time. Elle représente une date et une heure avec
 * un fuseau horaire spécifique.
 *
 * ZoneId
 * ZoneOffset
 */
public class ExempleZonedDateTime {

    public static void main(String[] args) {
        new ExempleZonedDateTime().zoneDateTime();
        new ExempleZonedDateTime().printAllZones();
        new ExempleZonedDateTime().printOffset();
    }

    void zoneDateTime() {
        System.out.println(" -------------- zoneDateTime ---------------");
        LocalDateTime now = LocalDateTime.now();
        ZoneId myZone = ZoneId.systemDefault();
        System.out.println("Output of systemDefault(): " + myZone);
        ZonedDateTime myZonedDateTime = ZonedDateTime.of(now, myZone);
        //2023-09-03T02:54:37.528950+02:00[Europe/Zurich]
        System.out.println(myZonedDateTime);

        //calculating time in bucharest now
        ZoneId zoneBucharest = ZoneId.of("Europe/Bucharest");
        ZonedDateTime zonedDateTimeInBucharest = ZonedDateTime.of(now, zoneBucharest);
        System.out.println(zonedDateTimeInBucharest);
        ZonedDateTime bucharestZonedDateTime = ZonedDateTime.now(zoneBucharest);

        //2023-09-03T03:57:27.798509+03:00[Europe/Bucharest]
        System.out.println(bucharestZonedDateTime);
    }

    void printAllZones() {
        System.out.println(" -------------- printZones ---------------");
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(String.format("found %d time zones", availableZoneIds.size()));
        availableZoneIds.forEach(System.out::println);
    }

    void printOffset() {
        System.out.println(" -------------- printZones ---------------");
        ZonedDateTime now = ZonedDateTime.now();
        ZoneOffset offset = now.getOffset();
        String id = offset.getId();
        System.out.println("id: %s".formatted(id)); //id: +02:00
        System.out.println(offset); //+02:00
    }

    void of() {

        ZoneId zoneZurich = ZoneId.of("Europe/Zurich");

        ZonedDateTime zdtExtended = ZonedDateTime.of(2023, 11, 10, 1, 20, 30, 100, zoneZurich);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        ZonedDateTime zdtLDLT = ZonedDateTime.of(localDate, localTime, zoneZurich);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zdtLDT = ZonedDateTime.of(localDateTime, zoneZurich);
        System.out.println(zdtLDT);  //2023-10-22T08:26:16.798939+02:00[Europe/Zurich]
    }
}
