package org.example.chap6.animal.sauvage;

import org.example.chap6.animal.Animal;

public class AnimalSauvage extends Animal {

    public static void main(String[] args) {
        Animal as = new AnimalSauvage();
        // La methode "weight" appelée ici est celui de la classe "AnimalSauvage" qui se trouve dans un autre package.
        // et dans ce cas la methode n'est pas visible
        // as.weight(12);

        // as.height(12); Pareil la methode n'est pas visible depuis un autre package car dans la declaration de la
        // methode, il manque "public"

        AnimalSauvage p2 = new AnimalSauvage();
        p2.weight(4);
        // p2.height(5); // methode non déclaré "public" => NOT COMPILE!

    }
}
