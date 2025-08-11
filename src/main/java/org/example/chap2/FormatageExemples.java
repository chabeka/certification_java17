package org.example.chap2;

public class FormatageExemples {
    public static void main(String[] args) {
        int entier = 123;
        double flottant = 123.456;
        char caractere = 'A';
        boolean bool = true;
        String chaine = "Hello, World!";
        java.util.Date date = new java.util.Date();

        // Entiers
        System.out.printf("Entier décimal: %d%n", entier);
        System.out.printf("Entier octal: %o%n", entier);
        System.out.printf("Entier hexadécimal: %x%n", entier);
        System.out.printf("Entier hexadécimal en majuscules: %X%n", entier);

        // Nombres à virgule flottante
        System.out.printf("Nombre flottant: %f%n", flottant);
        System.out.printf("Notation scientifique: %e%n", flottant);
        System.out.printf("Notation scientifique en majuscules: %E%n", flottant);
        System.out.printf("Hexadécimal avec exposant: %a%n", flottant);
        System.out.printf("Hexadécimal avec exposant en majuscules: %A%n", flottant);

        // Caractères
        System.out.printf("Caractère: %c%n", caractere);
        System.out.printf("Caractère en majuscules: %C%n", caractere);

        // Booléens
        System.out.printf("Booléen: %b%n", bool);
        System.out.printf("Booléen en majuscules: %B%n", bool);

        // Chaînes de caractères
        System.out.printf("Chaîne: %s%n", chaine);
        System.out.printf("Chaîne en majuscules: %S%n", chaine);

        // Dates et heures
        System.out.printf("Heure (24h): %tH%n", date);
        System.out.printf("Heure (12h): %tI%n", date);
        System.out.printf("Minutes: %tM%n", date);
        System.out.printf("Secondes: %tS%n", date);
        System.out.printf("Millisecondes: %tL%n", date);
        System.out.printf("Nanosecondes: %tN%n", date);
        System.out.printf("AM/PM: %tp%n", date);
        System.out.printf("Fuseau horaire: %tz%n", date);
        System.out.printf("Nom du fuseau horaire: %tZ%n", date);
        System.out.printf("Timestamp en secondes: %ts%n", date);
        System.out.printf("Timestamp en millisecondes: %tQ%n", date);
        System.out.printf("Nom complet du mois: %tB%n", date);
        System.out.printf("Nom abrégé du mois: %tb%n", date);
        System.out.printf("Nom complet du jour de la semaine: %tA%n", date);
        System.out.printf("Nom abrégé du jour de la semaine: %ta%n", date);
        System.out.printf("Année (4 chiffres): %tY%n", date);
        System.out.printf("Année (2 chiffres): %ty%n", date);
        System.out.printf("Jour de l'année: %tj%n", date);
        System.out.printf("Mois (2 chiffres): %tm%n", date);
        System.out.printf("Jour du mois (2 chiffres): %td%n", date);
        System.out.printf("Jour du mois (1-31): %te%n", date);
    }
}
