package org.example.chap6.heritage.redefinitionvariable;

public class Francais extends Language{
    private int x;
    private int y;
    private int z;

    protected int a = 20;

    public int weight = 2;
    public int height = 4;

    //he super.getWeight() method returns 3 from the variable in the parent class,
    // as polymorphism and overriding do not apply to instance variables.
    public void printDetails() {
        System.out.print(super.getWeight() + "," + this.height);
    }
}
