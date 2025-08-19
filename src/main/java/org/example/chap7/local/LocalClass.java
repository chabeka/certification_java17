package org.example.chap7.local;

public class LocalClass {
    private int length;

    public LocalClass(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass(10);
        localClass.calculate(Integer.parseInt(args[0]));
    }

    public void calculate(int x) {
        int width = 10;
        //Pour que la variable soit ccessible dans la classe Calculator, il faut qu'elle soit final ou effective final
        //width = 12; // Dans ce cas son utilisation dans la classe Calculator n'est plus possible
        //nested local class
        class Calculator {

            public void multiply() {
                System.out.println(width * length);
                System.out.println(x);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();

    }
}
