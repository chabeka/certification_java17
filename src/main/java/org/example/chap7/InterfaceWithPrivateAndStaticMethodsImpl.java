package org.example.chap7;


public class InterfaceWithPrivateAndStaticMethodsImpl implements InterfaceWithPrivateAndStaticMethods{

    public static void main(String[] args) {
        InterfaceWithPrivateAndStaticMethods instance = new InterfaceWithPrivateAndStaticMethodsImpl();
        instance.methodeParDefaut();

        //instance.methodeStatique(); // DOES NOT COMPILE
        InterfaceWithPrivateAndStaticMethods.methodeStatique(); // COMPILE

        // Les méthodes statiques ne peuvent pas être appelées via une instance de la classe
        //instance.autreMethodeStatique();// DOES NOT COMPILE

        
    }

    @Override
    public void methodeParDefaut() {
        System.out.println("Appel de methodeParDefaut de la classe fille");
        InterfaceWithPrivateAndStaticMethods.super.methodeParDefaut();

        // Les méthodes statiques définies dans une interface sont appelées en utilisant le nom de l'interface
        // "InterfaceWithPrivateAndStaticMethods.autreMethodeStatique"
        // autreMethodeStatique(); // DOES NOT COMPILE

        autreMethodeParDefaut(); // appel direct de la methode par defaut dans la classe fille
    }
}
