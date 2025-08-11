package org.example.chap4.time;

import java.time.*;

/**
 *  La classe Period de l'API de date et heure (java.time) est utilisée pour représenter une période de temps
 *  en termes d'années, de mois et de jours <br>
 * P2Y3M15D: <br>
 * P signifie "Période".
 * 2Y signifie "2 années".
 * 3M signifie "3 mois".
 * 15D signifie "15 jours".
 */
public class ExemplePeriod {

    public static void main(String[] args) {
        new ExemplePeriod().periodOf();
        new ExemplePeriod().periodDoesNotChain();
        new ExemplePeriod().ofVsPlus();
        new ExemplePeriod().of();
        new ExemplePeriod().parsePeriod();
    }

    void periodOf() {
        System.out.println(" ----------- periodOf -------------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);     //2023-09-03T03:07:43.919980
        Period period = Period.ofDays(5).plusYears(1);
        System.out.println(period);  //P1Y5D
        period = Period.ofDays(5).plusYears(1).minusMonths(11);
        System.out.println(period);  //P1Y-11M5D
        period = Period.ofDays(5).plusYears(1).plusMonths(11);
        System.out.println(period);  //P1Y11M5D
        period = Period.ofDays(370).plusYears(1).plusMonths(13);
        System.out.println(period);  //P1Y12M10D
        LocalDateTime future = now.plus(period);
        System.out.println(future); //2024-09-08T03:07:43.919980

        period = Period.ofDays(4).plusMonths(2);
        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();
        System.out.println("days: " + days + " months: " + months + " years: " + years);
        //no methods such as getHours, getMinutes, getSeconds()
    }

    /**
     * Lorsqu'on enchaine plusieurs création de Period avec "Period.àf" seul le dernier est prise en compte
     */
    void periodDoesNotChain() {
        System.out.println(" ----------- periodDoesNotChain -------------");
        //Period does not chain. Only the last method is considered!
        Period period = Period.ofYears(1).ofMonths(2).ofDays(1);
        System.out.println(period);  //P1D
    }

    void addPeriodToLocalDate() {
        System.out.println(" ----------- addPeriodToLocalDate -------------");
        LocalDate today = LocalDate.now();
        System.out.println(today);  //2024-03-10
        //period of one year, one month, one day
        Period period = Period.of(1, 1, 1);
        LocalDate future = today.plus(period);
        System.out.println(future); //2025-04-11
    }

    void ofVsPlus() {
        System.out.println(" ----------- ofVsPlus -------------");
        //this is a static method
        Period oneDay = Period.ofDays(1);
        System.out.println(oneDay);  //P1D
        //this is an instance method, so this I can chain
        Period p2 = oneDay.plusDays(2);
        System.out.println(p2);  //P3D
        //example of chaining
        p2 = oneDay.plusYears(2).plusMonths(3).plusDays(5);
        System.out.println(p2);  //P2Y3M6D
    }

    void of() {
        System.out.println(" ----------- of -------------");
        Period birthday = Period.of(2023, Month.NOVEMBER.getValue(), 10);
        System.out.println(birthday);
    }

    void parsePeriod() {
        System.out.println(" ----------- parsePeriod -------------");
        Period period = Period.parse("P2M3D");
        System.out.println(period);

        //Exception in thread "main" java.time.format.DateTimeParseException: Text cannot be parsed to a Period
        try {
            Period.parse("2M3D");
        } catch (DateTimeException e) {
            e.printStackTrace();
        }
    }
}
