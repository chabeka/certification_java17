package org.example.chap2;

/**
 *  Le type double est un type primitif utilisé pour représenter des nombres à virgule flottante en double précision
 *  Caractéristiques du type double
 * Taille : 64 bits (8 octets)
 * Plage de valeurs : Environ ±1.79769313486231570E+308 (valeurs approximatives)
 * Précision : Environ 15 à 16 chiffres décimaux
 */
public class DoubleExample {


    public static void main(String[] args) {

        double d1 = 3.141592653589793;
        double d2 = 1.23e10; // Utilisation de la notation scientifique

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

        double sum = d1 + d2;
        double difference = d1 - d2;
        double product = d1 * d2;
        double quotient = d1 / d2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        float f = (float) d1; // Conversion explicite de double vers float
        System.out.println("Float representation: " + f);

        int i = (int) d1; // Conversion explicite de double vers int
        System.out.println("Int representation: " + i);

        String str = Double.toString(d1);
        System.out.println("String representation: " + str);

        double parsedDouble = Double.parseDouble("3.141592653589793");
        System.out.println("Parsed double: " + parsedDouble);

        int comparison = Double.compare(d1, d2);
        System.out.println("Comparison result: " + comparison); // Affiche un nombre négatif car d1 < d2
    }

    /**
     * La conversion de double vers float nécessite un cast explicite, car elle peut entraîner une perte de précision
     */
    public void doubleToFloat() {
        double d = 3.141592653589793;
        float f = (float) d; // Conversion explicite (cast)
        System.out.println(f); // Affiche 3.1415927
    }

    /**
     * La conversion de float vers double est implicite et ne nécessite pas de cast explicite
     */
    public void floatToDouble() {
        float f = 3.14f;
        double d = f; // Conversion implicite
        System.out.println(d); // Affiche 3.14
    }

    /**
     * La conversion de double vers int nécessite également un cast explicite, et les valeurs décimales seront tronquées
     */
    public void doubleToInt() {
        double d = 3.14;
        int i = (int) d; // Conversion explicite (cast)
        System.out.println(i); // Affiche 3
    }


}


