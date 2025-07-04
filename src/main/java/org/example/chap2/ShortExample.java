package org.example.chap2;

public class ShortExample {
    public static void main(String[] args) {
        // Déclaration et initialisation
        short a = 100;
        short b = -200;
        short c = 32767;  // Valeur maximale
        short d = -32768; // Valeur minimale

        // Opérations arithmétiques
        // obligé de caster le resultat des opération entre les short
        short sum = (short) (a + b);
        short difference = (short) (a - b);
        short product = (short) (a * b);
        short quotient = (short) (a / 2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Lorsque ce sont des valeurs littérales, ont est pas obligé de caster
        short lit = 4 + 6;

        // Parcontre on ne peut pas faire
        //short litPlusShort = 5 + lit; // dans ce cas il faudra caster

        // Conversion entre types
        int i = a;
        short s = (short) i;
        // Conversion implicite
        short convImpl = 100;
        int iint = convImpl;    // Conversion implicite en int
        long l = convImpl;   // Conversion implicite en long
        float f = convImpl;  // Conversion implicite en float
        double dou = convImpl; // Conversion implicite en double

        // Conversion explicite, obligé de catser car les autres types sont plus large que le short
        int iexpl = 100;
        short sexpl = (short) iexpl; // Conversion explicite en short

        long lexpl = 100L;
        short s2 = (short) lexpl; // Conversion explicite en short

        float fexpl = 100.0f;
        short s3 = (short) fexpl; // Conversion explicite en short

        double dexpl = 100.0;
        short s4 = (short) dexpl; // Conversion explicite en short

        System.out.println("Converted int to short: " + s);

        // Utilisation dans les tableaux
        short[] shortArray = {100, 200, 300, 400, 500};
        for (short value : shortArray) {
            System.out.println("Array value: " + value);
        }

        // Utilisation avec les classes utilitaires
        String str = Short.toString(a);
        short parsedShort = Short.parseShort("200");

        System.out.println("String representation: " + str);
        System.out.println("Parsed short: " + parsedShort);
        System.out.println("Max value: " + Short.MAX_VALUE);
        System.out.println("Min value: " + Short.MIN_VALUE);
    }
}
