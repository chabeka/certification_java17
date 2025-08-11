package org.example.chap5;

public class AutoboxingExample {

    public static void main(String[] args) {
        Integer boxedInt1 = 100;
        Integer boxedInt2 = 100;
        Integer boxedInt3 = 200;
        Integer boxedInt4 = 200;
        Integer boxedInt5 = 200;
        Integer boxedInt6 = 200;

        // Comparaison avec ==
        System.out.println("boxedInt1 == boxedInt2: " + (boxedInt1 == boxedInt2)); // true, car les valeurs sont dans le cache
        System.out.println("boxedInt3 == boxedInt4: " + (boxedInt3 == boxedInt4)); // false, car les valeurs ne sont pas dans le cache

        // Comparaison avec equals()
        System.out.println("boxedInt1.equals(boxedInt2): " + boxedInt1.equals(boxedInt2)); // true
        System.out.println("boxedInt3.equals(boxedInt4): " + boxedInt3.equals(boxedInt4)); // true
    }

    void boxing() {
        int age = 30;
        Integer wrapper = Integer.valueOf(age);
        int primitive = wrapper.intValue();
        //autoboxing
        wrapper = age;
        //unboxing
        primitive = wrapper;
    }

    void nullUnbox() {
        Integer wrapper = 30;
        wrapper = null;
        //Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "java.lang.Integer.intValue()" because "wrapper" is null
        int primitive = wrapper;
    }



}
