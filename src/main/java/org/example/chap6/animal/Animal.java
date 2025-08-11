package org.example.chap6.animal;

public class Animal {

    protected int speed = 5;
    protected int weight = 10;
    protected void weight(int weight) {
        System.out.println("weight is: " + weight);
    }

    void height(int height) {
        System.out.println("height is: " + height);
    }

    protected void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }
}
