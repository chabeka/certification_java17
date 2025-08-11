package org.example.chap4.time;

import java.time.Duration;
import java.time.LocalTime;

/**
 *  Le temps dans une journée
 *  la classe LocalTime de l'API de date et heure (java.time) est utilisée pour représenter une heure sans date,
 *  c'est-à-dire uniquement les heures, les minutes, les secondes et les nanosecondes
 */
public class ExempleLocalTime {

    public static void main(String[] args) {
        new ExempleLocalTime().localTimeWithDuration();
        new ExempleLocalTime().of();
    }
    void localTimeWithDuration() {
        LocalTime in10 = LocalTime.now().plus(Duration.ofMinutes(10));
        System.out.println(in10);
    }

    void of() {
        LocalTime localTimeHM = LocalTime.of(12, 15);
        System.out.println(localTimeHM); //12:15
        LocalTime localTimeHMS = LocalTime.of(12, 14, 45);
        System.out.println(localTimeHMS); //12:14:45
        //4 parameters here
        LocalTime localTimeHMSN = LocalTime.of(12, 15, 45, 376);
        System.out.println(localTimeHMSN); //12:15:45.000000376
    }
}
