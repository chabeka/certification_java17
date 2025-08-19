package org.example.chap7.defaultmethode;

public interface InterfaceMethodeManagement {

    static void staticMethode() {
        System.out.println(" this is static methode");
    }

    private static void privateStaticMethode() {
        System.out.println(" this is privateStaticMethode");
    }

    private void privateMethode() {
        System.out.println("this is private methode");
    }

    default void defaultMethode() {
        System.out.println(" this is default methode");
        staticMethode();
        privateStaticMethode();
        privateMethode();
        anotherDefaultMethode();
        publicMethodeOfinterface();
    }
    default void anotherDefaultMethode() {
        System.out.println("this is anotherDefaultMethode in interface");
    }

    void publicMethodeOfinterface();
}
