package org.example.chap8.referencemethode;

import java.util.function.Consumer;

@FunctionalInterface
interface AfficherOperande {
    void afficherOperande(int a, int b);
}
public class RefToStaticMethode {

    public static void afficherMessage() {
        System.out.println("Bonjour, monde!");
    }

    private static void afficherMessage(String s) {
        System.out.println(s);
    }

    private static void afficherLesOperateurs(int a, int b) {
        System.out.println("Opérateur 1: " + a + " Opérateur 2: " + b);
    }

    public static void main(String[] args) {
        Runnable run = RefToStaticMethode::afficherMessage;
        run.run();

        Consumer<String> consumer = RefToStaticMethode::afficherMessage;
        consumer.accept("affiche moi");

        AfficherOperande aff = RefToStaticMethode::afficherLesOperateurs;
        aff.afficherOperande(12, 34);
    }
}
