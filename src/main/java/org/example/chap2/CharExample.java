package org.example.chap2;

/**
 * Taille : 16 bits (2 octets)
 * Plage de valeurs : 0 à 65,535 (0x0000 à 0xFFFF)
 * Type de données non signé : Le type char ne peut représenter que des valeurs positives.
 * Représentation : Les valeurs de type char sont des caractères Unicode.
 */
public class CharExample {
    public static void main(String[] args) {
        // Déclaration et initialisation
        char c1 = 'A';
        char c2 = 65;  // Code Unicode du caractère 'A'
        char c3 = '\u0041'; // Code Unicode en notation hexadécimale

        System.out.println("Char c1: " + c1);
        System.out.println("Char c2: " + c2);
        System.out.println("Char c3: " + c3);

        // Opérations arithmétiques
        int sum = c1 + c2;
        int difference = c1 - c2;
        int product = c1 * c2;
        int quotient = c2 / c1;

        System.out.println("Sum: " + sum); // Affiche: 130 (65 + 65)
        System.out.println("Difference: " + difference); // Affiche: 0 (65 - 65)
        System.out.println("Product: " + product); // Affiche: 4225 (65 * 65)
        System.out.println("Quotient: " + quotient); // Affiche: 1 (65 / 65)

        // Conversion entre types
        int i = c1;
        char cConverted = (char) i;

        System.out.println("Converted int to char: " + cConverted);

        // Utilisation dans les tableaux
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        for (char value : charArray) {
            System.out.println("Array value: " + value);
        }

        // Utilisation avec les classes utilitaires
        boolean isLetter = Character.isLetter(c1);
        boolean isDigit = Character.isDigit(c1);
        char upperCase = Character.toUpperCase(c1);
        char lowerCase = Character.toLowerCase(c1);
        String str = Character.toString(c1);

        System.out.println("Is letter: " + isLetter);
        System.out.println("Is digit: " + isDigit);
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lowerCase);
        System.out.println("String representation: " + str);
    }

    void autobox() {
        char c = 'a';
        Character d = c;

        Character e = 'b';
        Character f = Character.valueOf('a');

        //
    }

    void intChar() {
        Character c = 5;
        char d = 4;
        System.out.println(d);

        char diff = 'z' - 26;
        int diffInt = 'z' - 26;
        System.out.println(diff);  //`
        System.out.println(diffInt); //96
        int delta = 'z' - 'a';
        System.out.println(delta);  //25
    }

    /**
     * Character is not a numeric type and therefore doesn’t supply a byteValue() or intValue method
     * method.
     */
    void methodsOfCharacter() {
        Character a = Character.valueOf('a');
        char c = a.charValue();
        //there ain't intValue()
        //a.intValue()  //does not compile!

    }
}
