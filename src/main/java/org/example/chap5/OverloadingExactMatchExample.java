package org.example.chap5;

/**
 * En Java, la surcharge de méthodes (method overloading) permet de définir plusieurs méthodes avec le même nom mais
 * des paramètres différents. La résolution de la méthode appropriée à appeler est effectuée par le compilateur en
 * fonction des types et du nombre de paramètres passés lors de l'appel de la méthode.
 * @param args
 */
public class OverloadingExactMatchExample {


    public static void main(String[] args) {
        OverloadingExactMatchExample example = new OverloadingExactMatchExample();

        // Appel de la méthode avec un paramètre int
        example.print(5);

        // Appel de la méthode avec un paramètre double
        example.print(5.5);

        // Appel de la méthode avec deux paramètres int
        example.print(5, 10);

        // Appel de la méthode avec un paramètre String
        example.print("Bonjour");
    }

    // Méthode avec un seul paramètre int
    public void print(int number) {
        System.out.println("Nombre entier : " + number);
    }

    // Méthode avec un seul paramètre double
    public void print(double number) {
        System.out.println("Nombre double : " + number);
    }

    // Méthode avec deux paramètres int
    public void print(int number1, int number2) {
        System.out.println("Deux nombres entiers : " + number1 + ", " + number2);
    }

    // Méthode avec un paramètre String
    public void print(String text) {
        System.out.println("Texte : " + text);
    }
}
