package org.example.chap4.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * la classe LocalDate de l'API de date et heure (java.time) est utilisée pour représenter une date sans heure,
 * c'est-à-dire uniquement l'année, le mois et le jour.
 */
public class ExempleLocalDate {

    void addToInstant() {
        LocalDate aujourdHui = LocalDate.now();

        // Ajouter des jours, des mois ou des années à une date
        LocalDate dansUneSemaine = aujourdHui.plusWeeks(1);
        System.out.println("Dans une semaine : " + dansUneSemaine);

        LocalDate dansUnMois = aujourdHui.plusMonths(1);
        System.out.println("Dans un mois : " + dansUnMois);

        LocalDate dansUnAn = aujourdHui.plusYears(1);
        System.out.println("Dans un an : " + dansUnAn);

        // Soustraire des jours, des mois ou des années d'une date
        LocalDate ilYAUneSemaine = aujourdHui.minusWeeks(1);
        System.out.println("Il y a une semaine : " + ilYAUneSemaine);

        LocalDate ilYAUnMois = aujourdHui.minusMonths(1);
        System.out.println("Il y a un mois : " + ilYAUnMois);

        LocalDate ilYAUnAn = aujourdHui.minusYears(1);
        System.out.println("Il y a un an : " + ilYAUnAn);
    }

    void compare2LocalDate () {
        LocalDate aujourdHui = LocalDate.now();
        LocalDate dateSpecifique = LocalDate.of(2023, 10, 1);

        // Comparer deux dates
        boolean estAvant = aujourdHui.isBefore(dateSpecifique);
        boolean estApres = aujourdHui.isAfter(dateSpecifique);
        System.out.println("Est-ce qu'aujourd'hui est avant la date spécifique ? " + estAvant);
        System.out.println("Est-ce qu'aujourd'hui est après la date spécifique ? " + estApres);
    }

    void invalidLocalDate() {
        //Exception in thread "main" java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 16
        LocalDate notALD = LocalDate.of(2023, 16, 12);

    }
}
