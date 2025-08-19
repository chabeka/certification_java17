package org.example.chap7.enums;

public enum JourSemaine {
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE;

    private static String version = "2.0";
    private static final String firstVersion = "1.0";

    private String description;

    public String ordre;
    JourSemaine() {
        // System.out.println(version);
        System.out.println(firstVersion);
        System.out.println(ordre);
        System.out.println(description);
    }
}
