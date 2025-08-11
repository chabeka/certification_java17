package org.example.chap6.casting;

import org.example.chap6.animal.Animal;
import org.example.chap6.animal.AnimalDomestique;
import org.example.chap6.animal.Chien;

public class Casting {

    void cast() {
        Animal p1 = new Animal();
        Chien c1 = new Chien();
        Animal p2 = new Chien();
        //p1 est de type Animal donc ne peut pas être casté comme Chien
        //compile mais erreur à l'execution
        //Animal p3 = (Chien) p1; // java.lang.ClassCastException

        // on ne peut pas referencer un objet de type inferieur (enfant) dans un objet de type Parent
        //Chien c2 = (Animal) c1; //does not compile
        Animal b4 = (Animal) p2;
        Chien h3 = (Chien) p2;
    }

    public static void main(String[] args) {
        new Casting().cast();

    }
}
