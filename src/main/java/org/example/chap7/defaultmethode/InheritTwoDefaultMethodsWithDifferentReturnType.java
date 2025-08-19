package org.example.chap7.defaultmethode;

public class InheritTwoDefaultMethodsWithDifferentReturnType {

    interface Chair {

        default String getSKU() {
            return "1";
        }
    }

    interface Desk {

        default int getSKU() {
            return 1;
        }
    }

    /*
        Il n'est pas possible d'heriter deux interfaces implementant une methode de même nom et retournant des types
        différents,
     */
    public class InheritTwoDefaultMethodsWithDifferentReturn /**implements Chair, Desk */
    {

    }
}
