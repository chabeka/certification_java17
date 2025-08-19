package org.example.chap7.enums;

import static org.example.chap7.enums.JourSemaine.MARDI;

public class UsageOfEnum {

    void switchEnum() {
        JourSemaine jour = JourSemaine.LUNDI;
        var message = switch (jour) {
            //does not compile - An enum switch case label must be the unqualified name of an enumeration constant
            //case JourSemaine.LUNDI -> "not compile";
            case LUNDI -> "Premier jour de la semaine";
            case MARDI -> "2eme jour de la semaine";
            default -> "Dimanche";
        };


    }

    public static void main(String[] args) {
        for(Mois mois : Mois.values()) {
            System.out.print("name: " + mois.name() + " - ");
            mois.printDescription();
        }
    }
}
