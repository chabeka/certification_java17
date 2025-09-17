package org.example.chap8.referencemethode;

import java.util.function.Supplier;

public class RefToConstructor {

    public RefToConstructor() {
        System.out.println("Constructeur appelé!");
    }
    public static void main(String[] args) {
        Supplier<RefToConstructor> fournisseur = RefToConstructor::new;
        RefToConstructor exemple = fournisseur.get(); // Affiche "Constructeur appelé!"
    }
}
