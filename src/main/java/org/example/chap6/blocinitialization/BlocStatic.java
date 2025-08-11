package org.example.chap6.blocinitialization;

public class BlocStatic {

    // Variable statique
    static int compteur;

    // Bloc static
    static {
        System.out.println("");
        System.out.print("A");
    }

    // Constructeur
    public BlocStatic() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        BlocStatic exemple1 = new BlocStatic(); // print AB
        BlocStatic exemple2 = new BlocStatic(); // print B
    }
}
