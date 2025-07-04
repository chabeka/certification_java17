package org.example.chap2;

public class CallingMethodPrimitive {
    int returningALongAsAnInt(long x) {
        // return x;  //does not compile! car le type long est plus large que le type int
        return (int) x;
    }

    long returningAnIntAsALong(int x) {
        return x;
    }

    /**
     * Gestion des dépassements de capacité
     */
    void OverflowExample() {
        long largeValue = 2147483648L; // Valeur juste au-dessus de la plage de int
        int convertedValue = (int) largeValue; // Dépassement de capacité

        System.out.println("Large value: " + largeValue);
        System.out.println("Converted value: " + convertedValue); // Affiche une valeur incorrecte
    }

    void classutilitaires() {
        int intValue = 12345;
        long longValue2 = 12345L;

        // Utilisation avec les classes utilitaires
        Long longValue3 = Long.valueOf(intValue); // Conversion avec Long.valueOf()
        int intValue3 = Long.valueOf(longValue2).intValue(); // Conversion avec intValue()

        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue3);
        System.out.println("Long value: " + longValue2);
        System.out.println("Int value: " + intValue3);
    }
}
