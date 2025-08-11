package org.example.chap6.animal.test;

import org.example.chap6.animal.Animal;
import org.example.chap6.animal.Chien;

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        // animal.faireDuBruit(); // Erreur de compilation : faireDuBruit() n'est pas accessible ici

        Chien chien = new Chien();
        //chien.faireDuBruit(); // // Erreur de compilation : faireDuBruit() n'est pas accessible ici
    }
}
