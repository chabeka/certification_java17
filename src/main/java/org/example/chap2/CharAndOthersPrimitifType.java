package org.example.chap2;

public class CharAndOthersPrimitifType {
    public static void main(String[] args) {
        // Conversion implicite de char à int
        char charValue = 'A';
        int intValue = charValue; // Conversion implicite
        System.out.println("Char value: " + charValue);
        System.out.println("Int value: " + intValue); // Affiche: 65

        // Conversion explicite de int à char
        int intValue2 = 65;
        char charValue2 = (char) intValue2; // Conversion explicite
        System.out.println("Int value: " + intValue2);
        System.out.println("Char value: " + charValue2); // Affiche: A

        // Gestion des dépassements de capacité
        int largeValue = 70000; // Valeur au-dessus de la plage de char
        char convertedChar = (char) largeValue; // Dépassement de capacité
        System.out.println("Large value: " + largeValue);
        System.out.println("Converted char: " + convertedChar); // Affiche une valeur incorrecte

        // Utilisation avec les classes utilitaires
        int intValue3 = Character.getNumericValue(charValue); // Conversion avec Character.getNumericValue()
        char[] chars = Character.toChars(intValue2); // Conversion avec Character.toChars()
        System.out.println("Char value: " + charValue);
        System.out.println("Int value: " + intValue3); // Affiche: 10 (car 'A' est traité comme un chiffre hexadécimal)
        System.out.println("Int value: " + intValue2);
        System.out.println("Char value: " + chars[0]); // Affiche: A


        CharAndOthersPrimitifType charAndInt = new CharAndOthersPrimitifType();
        charAndInt.unicode();
    }

    void unicode() {
        //note: \u0061 means in hex, 6*16+1 = 97 (in decimal)
        char c = '\u0061';
        char d = 'a';
        System.out.println(c == d); //true
        System.out.println('\u0061');
        int charAsInt = c;
        System.out.println("char as int: "+charAsInt);  //97
    }
}
