package org.example.chap6.blocinitialization;

public class BlocInstance {
    // Variable d'instance
    int valeur;

    // Bloc d'instance
    {
        System.out.print("A");
    }

    // Constructeur
    public BlocInstance() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("Main exécuté.");
        BlocInstance exemple1 = new BlocInstance(); // print => AB
        BlocInstance exemple2 = new BlocInstance(); // print => AB
    }
}
