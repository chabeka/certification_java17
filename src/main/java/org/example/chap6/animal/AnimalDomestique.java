package org.example.chap6.animal;

public class AnimalDomestique extends Animal{

    public static void main(String[] args) {
        Animal chat = new AnimalDomestique();
        chat.weight(12);
        chat.height(100);

        AnimalDomestique p2 = new AnimalDomestique();
        p2.weight(4);
        p2.height(5);

    }
}
