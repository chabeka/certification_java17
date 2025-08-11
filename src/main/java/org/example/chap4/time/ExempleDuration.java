package org.example.chap4.time;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 *  La classe Duration de l'API de date et heure (java.time) est utilisée pour représenter une quantité de temps,
 *  généralement en termes de secondes et de nanosecondes.
 *  PT5H30M45S:
 *  PT signifie "Période de Temps".
 *  5H signifie "5 heures".
 *  30M signifie "30 minutes".
 *  45S signifie "45 secondes".
 */
public class ExempleDuration {

    public static void main(String[] args) {
        new ExempleDuration().between();
        new ExempleDuration().addDurationToDate();
        new ExempleDuration().manipulateDuration();
        //new DurationExemple().methodsOfDuration();
        //new DurationExemple().invalidDuration();
        //new DurationExemple().durationWithLocalDate();
        //new ExempleDuration().durationVsPeriodWithLocalDate();
        new ExempleDuration().durationOf();
    }

    void durationOf () {
        System.out.println(" ----------- durationOf ---------------");
        var durationOfDay = Duration.ofDays(1);
        System.out.println(durationOfDay);
        var durationOfMin = Duration.ofMinutes(70);
        System.out.println(durationOfMin);
        var durationOfSec = Duration.ofSeconds(3610);
        System.out.println(durationOfSec);
    }
    void between() {
        var now = Instant.now();
        var later = Instant.now();
        System.out.println("instant: " + later); //2023-09-03T19:55:15.400194Z
        var duration = Duration.between(now, later);
        System.out.println("elapsed time: " + duration.toNanos() + "ns");
    }

    void addDurationToDate() {
        // With DATE
        Duration d1h = Duration.ofHours(1L);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //2023-10-23T00:57:58.181994
        LocalDateTime then = now.plus(d1h);
        System.out.println(then);  //2023-10-23T01:57:58.181994

        // With INSTANT
        Duration duree = Duration.ofHours(5);
        // Soustraire une durée d'un instant
        Instant plusTot = Instant.now().minus(duree);
        System.out.println("Instant plus tôt : " + plusTot);
    }

    void manipulateDuration() {
        Duration duration = Duration.ofDays(1L);
        System.out.println(duration); //PT24H

        duration = duration.plus(1, ChronoUnit.SECONDS)
                .plus(1, ChronoUnit.MINUTES)
                .plus(1, ChronoUnit.DAYS);
        System.out.println(duration); //PT48H1M1S

        duration = Duration.ofNanos(1000L);
        System.out.println("duration 1k nanos: " + duration); // PT0.000001S

        Duration dureeCinqHeures = Duration.ofHours(5);
        System.out.println("Durée de 5 heures : " + dureeCinqHeures); // PT5H
    }

    void methodsOfDuration() {
        Duration duration = Duration.ofDays(1L);
        long seconds = duration.getSeconds();
        System.out.println(seconds);
        //no methods such as getHours, getMinutes, getDays

        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Days
        long days = duration.get(ChronoUnit.DAYS); // UnsupportedTemporalTypeException
        long hours = duration.get(ChronoUnit.HOURS); // UnsupportedTemporalTypeException
        long minutes = duration.get(ChronoUnit.MINUTES); // UnsupportedTemporalTypeException
        System.out.println(days);
    }

    /**
     * Obtient une durée représentant une quantité dans l'unité spécifiée.
     */
    void invalidDuration() {
        System.out.println( "-------------- invalidDuration -------------------------");
        System.out.println(Duration.of(3, ChronoUnit.NANOS));
        System.out.println(Duration.of(3, ChronoUnit.SECONDS));
        System.out.println(Duration.of(3, ChronoUnit.MINUTES));
        System.out.println(Duration.of(465, ChronoUnit.HOURS));
        System.out.println(Duration.of(465, ChronoUnit.DAYS));

        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
        System.out.println(Duration.of(465, ChronoUnit.WEEKS)); // UnsupportedTemporalTypeException
        Duration oneMonth = Duration.of(1, ChronoUnit.MONTHS); // UnsupportedTemporalTypeException
        Duration years = Duration.of(1, ChronoUnit.YEARS); // UnsupportedTemporalTypeException
        System.out.println(oneMonth);
    }

    void durationWithLocalDate() {
        System.out.println( "-------------- durationWithLocalDate -------------------------");
        //Duration is supposed to be used with objects that contain times.
        LocalDate now = LocalDate.now();
        Duration d1D = Duration.ofDays(1L);
        System.out.println(d1D); //PT24H
        //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
        //I cannot use Duration with LocalDate
        LocalDate then = now.plus(d1D);
        System.out.println(then);
    }

    void durationVsPeriodWithLocalDate() {
        System.out.println( "-------------- durationVsPeriodWithLocalDate -------------------------");
        var date = LocalDate.of(2023, 1, 21);
        var period = Period.ofDays(1);
        var days = Duration.ofDays(1);
        System.out.println(date.plus(period));   // 2023-01-22
        // Unsupported unit: Seconds
        //I can use Duration with LocalDate
        System.out.println(date.plus(days));
    }
}
