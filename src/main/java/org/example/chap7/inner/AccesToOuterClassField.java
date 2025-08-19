package org.example.chap7.inner;

public class AccesToOuterClassField {

    private int count;
    private static int staticField = 5;

    static class StaticNested {

        public int stampede() {

            //il est possible d'acceder directement au champs static de la classe englobante dans une classe
            //interne static
            System.out.println(staticField);

            //on-static field 'count' cannot be referenced from a static context
            // return count;  //DOES NOT COMPILE!
            return 0;
        }
    }
}
