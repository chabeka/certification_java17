package org.example.chap4.time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ExempleInstant {
    public static void main(String[] args) {
        // Créer un instant représentant le moment actuel
        Instant maintenant = Instant.now();
        System.out.println("Instant actuel : " + maintenant);

        // Créer un instant spécifique en utilisant une date et heure au format ISO-8601
        Instant instantSpecifique = Instant.parse("2023-10-01T10:15:30.00Z");
        System.out.println("Instant spécifique : " + instantSpecifique);

        Duration duree = Duration.ofHours(5);
        // Soustraire une durée d'un instant
        Instant plusTot = maintenant.minus(duree);
        System.out.println("Instant plus tôt : " + plusTot);

        // Convertir un instant en millisecondes depuis l'époque (1970-01-01T00:00:00Z)
        long epochMilli = maintenant.toEpochMilli();
        System.out.println("Millisecondes depuis l'époque : " + epochMilli);

        // Créer un instant à partir de millisecondes depuis l'époque
        Instant depuisEpochMilli = Instant.ofEpochMilli(epochMilli);
        System.out.println("Instant à partir des millisecondes depuis l'époque : " + depuisEpochMilli);
    }

    void addToInstant() {

        Instant now = Instant.now();
        Instant then = now.plus(1, ChronoUnit.DAYS);
        //2024-01-08T07:47:52.101744Z
        System.out.println(then);
        //adding a year - throws an exception
        try {
            //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Years
            Instant inOneYear = now.plus(1, ChronoUnit.YEARS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //same as adding a week
        try {
            //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Weeks
            now.plus(1, ChronoUnit.WEEKS);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void duration() {
        Instant before = Instant.now();
        Instant now = Instant.now();
        Duration duration = Duration.between(before, now);
        System.out.println("time elapsed: %d ns ".formatted(duration.getNano()));  //time elapsed: 3000 ns
    }

    void compare2Instant (){
        Instant maintenant = Instant.now();
        System.out.println("Instant actuel : " + maintenant);

        // Créer un instant spécifique en utilisant une date et heure au format ISO-8601
        Instant instantSpecifique = Instant.parse("2023-10-01T10:15:30.00Z");
        System.out.println("Instant spécifique : " + instantSpecifique);

        // Comparer deux instants
        boolean estAvant = maintenant.isBefore(instantSpecifique);
        boolean estApres = maintenant.isAfter(instantSpecifique);

        System.out.println("Est-ce que maintenant est avant l'instant spécifique ? " + estAvant);
        System.out.println("Est-ce que maintenant est après l'instant spécifique ? " + estApres);
    }
}
