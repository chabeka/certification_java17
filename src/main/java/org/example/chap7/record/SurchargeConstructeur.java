package org.example.chap7.record;

import java.time.LocalDate;

public record SurchargeConstructeur(String nom, String prenom, int age) {

    // Dans le contructeur canonique, ont doit initialiser les composant sinon erreur de compile
    // ERROR : Record component 'age' might not be initialized in canonical constructor si "age nest pas initialisé
    public SurchargeConstructeur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // surcharge des methode : toString
    @Override
    public String toString() {
        return " nom: " + nom + " prenom: " + prenom + " age: " + age;
    }

    // Ajout d'autres methodes
    public LocalDate calculerLocalDateNaissance() {
        LocalDate localDate = LocalDate.now().minusYears(age);
        System.out.println(localDate);
        return localDate;
    }

    public static void main(String[] args) {
        SurchargeConstructeur personne1 = new SurchargeConstructeur("bla", "bla", 10);
        personne1.calculerLocalDateNaissance();
    }
}
