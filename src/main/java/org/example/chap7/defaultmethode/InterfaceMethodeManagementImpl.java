package org.example.chap7.defaultmethode;

public class InterfaceMethodeManagementImpl implements InterfaceMethodeManagement{
    @Override
    public void publicMethodeOfinterface() {
        System.out.println("this is publicMethodeOfinterface");
    }
    @Override
    public void anotherDefaultMethode() {
        System.out.println("this is anotherDefaultMethode in implementation");
    }
    /*
    faire reference à une methode de la classe mere si la classe fille redéfinie la methode
     */
    public void referenceToParentmethode() {

        InterfaceMethodeManagement.super.anotherDefaultMethode();
        anotherDefaultMethode();
    }
}
