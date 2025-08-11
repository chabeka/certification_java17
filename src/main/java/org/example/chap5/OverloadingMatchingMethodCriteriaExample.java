package org.example.chap5;

/**
 * Critère de selection des methodes
 *   0) methode exacte
 *   1) promotion de type
 *   2) autoboxing
 *   3) vararg
 */
public class OverloadingMatchingMethodCriteriaExample {

    public static void main(String[] args) {
        OverloadingMatchingMethodCriteriaExample example = new OverloadingMatchingMethodCriteriaExample();
        example.callMethod();
    }

    //the perfect match would be: message(int a, int b)
    void callMethod() {
        // int => long => float => Autoboxing => varargs
        message(1, 2);
    }

    /*
     * list of overloaded methods
     */

    private void message(short num1, short num2) {
        System.out.println("shorts");
    }

    private void message(int... nums) {
        System.out.println("varargs");
    }

    private void message(Integer num1, Integer num2) {
        System.out.println("Integers");
    }

    private void message(float num1, float num2) {
        System.out.println("floats");
    }
    private void message(long num1, long num2) {
        System.out.println("longs");
    }
}
