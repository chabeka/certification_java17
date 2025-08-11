package org.example.chap2;

/**
 * le type float est un type primitif utilisé pour représenter des nombres à virgule flottante en simple précision
 * Caractéristiques du type float
 * Taille : 32 bits (4 octets)
 * Plage de valeurs : Environ ±3.40282347E+38F (valeurs approximatives)
 * Précision : Environ 6 à 7 chiffres décimaux
 */
public class FloatExample {
    public static void main(String[] args) {
        /*float f1 = 3.14f;
        float f2 = 1.23e10f;

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);

        float sum = f1 + f2;
        float difference = f1 - f2;
        float product = f1 * f2;
        float quotient = f1 / f2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        double d = f1; // Conversion implicite de float vers double
        System.out.println("Double representation: " + d);

        float f3 = (float) d; // Conversion explicite de double vers float
        System.out.println("Float representation: " + f3);

        int i = (int) f1; // Conversion explicite de float vers int
        System.out.println("Int representation: " + i);

        String str = Float.toString(f1);
        System.out.println("String representation: " + str);

        float parsedFloat = Float.parseFloat("3.14");
        System.out.println("Parsed float: " + parsedFloat);

        int comparison = Float.compare(f1, f2);
        System.out.println("Comparison result: " + comparison); // Affiche un nombre négatif car f1 < f2
*/
        complexTernary();
    }
    static void complexTernary() {
        int a1 = 2, a2 = 4, a3 = 2;
        System.out.println(a1 > 2 ? --a3 : a2++);  //4
        System.out.println("a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3);
        System.out.println(a2 = (a1 != a3 ? a1 : a2++));  //5  (the old a2)
        System.out.println("a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3);
        System.out.println(a1 > a2 ? a2 < a3 ? a2 : 2 : 1);  //1
        System.out.println("a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3);
    }

    /**
     * La conversion de float vers double est implicite et ne nécessite pas de cast explicite
     */
    public void floatToDouble (){
        float f = 3.14f;
        double d = f; // Conversion implicite
        System.out.println(d); // Affiche 3.14
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
     * La conversion de float vers int nécessite également un cast explicite, et les valeurs décimales seront tronquées
     */
    public void floatToInt(){
        float f = 3.14f;
        int i = (int) f; // Conversion explicite (cast)
        System.out.println(i); // Affiche 3
    }

}
