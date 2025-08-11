package org.example.chap6.animal;

import org.example.chap6.animal.sauvage.AnimalSauvage;

public class Chien extends Animal {
    /**
     * Dans la même classe : La méthode ou le membre protected est accessible à l'intérieur de la classe où il est défini.
     * Dans les sous-classes : La méthode ou le membre protected est accessible dans les classes filles, même si elles sont dans des packages différents.
     * Dans le même package : La méthode ou le membre protected est accessible aux autres classes du même package.
     */
    protected void faireDuBruit() {
        System.out.println("Le chien aboie");

        Animal animal = new Animal();
        // la methode faireDuBruit() est protected mais elle est accessible à ce niveau car se trouvant dans le même package
        animal.faireDuBruit();
    }
}
