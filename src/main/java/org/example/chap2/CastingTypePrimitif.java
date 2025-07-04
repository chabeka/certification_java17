package org.example.chap2;

import java.util.List;

public class CastingTypePrimitif {

    void castingBoolean() {
        Object s = false;
        boolean b = (boolean) s;
        Boolean aBoolean = false;
        boolean c = (boolean) aBoolean;
    }

    void castingEntreShortEtInt() {
        int n = 5;
        short s = 5;
        useInt(n);
        //cannot cast int to short
        //useShort(n);  //does not compile

        //casting a short into int
        useInt(s);
        useShort(s);
    }
    private void useShort(short s) {

    }

    private void useInt(int s) {
    }

    /**
     * tous les type primitif peuvent être casté en java.lang.Object
     * le type int ne peut être converti en Float
     * instanceof ne peut être utilisé avec un type primitif
     */
    void castingTypePrimitiveToObject() {
        byte b = 4;
        short s = 5;
        int i = 56;
        long l = 100L;
        float f = 4.5F;
        double d = 5.98D;
        char c = 'a';
        boolean bo = false;

        //all of these can be cast to Object
        Object oB = (Object) b;
        Object oS = (Object) s;
        Object oI = (Object) i;
        Object oL = (Object) l;
        Object oF = (Object) f;
        Object oD = (Object) d;
        Object oC = (Object) c;
        Object oBo = (Object) bo;

        //inconvertible types; cannot cast 'int' to 'java.lang.Float'
        //Float aFloat = (Float)i;  DOES NOT COMPILE
        Number nb = (Number) b;

        //weird but allowable
        if (oB instanceof List) {
        }
        //with instanceof I cannot use primitive
        //if(b instanceof Object){}  //does not compile
    }

    void dangerousCast() {
        int[][] array = {{1, 2, 3}, {2}};
        //keep in mind that int[] is an object;
        Object[] arrObj = array;
        //compiles but exception at runtime
        //Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
        arrObj[0] = "hello";
    }

    void byteToChar() {
        char c = 'a';
        byte b = 'a';
        int cAsAnInt = c;
        //byte s = c;  //does not compile
        byte b2 = (byte) c; // Requires explicit cast due to potential loss of information

        char myChar = '€';
        // € is  8364, out of scale for byte
        //byte euro = '€';

        char euro = '\u20ac';
        System.out.println(euro);
    }

    /**
     * Necessite un cast car char est non signé et a une plage de valeurs différente de celle du type short
     * char (0 à 65,535)
     * short (-32,XXX à 32,XXX)
     *  le type short est signé
     *  le type char est non signé
     *  les valeurs de char supérieures à 32,767 seront interprétées comme des valeurs négatives
     */
    void shortToChar() {
        char c = 'a';
        short s = 'a';
        int cAsAnInt = c;
        // short s = c;  //does not compile
        short s2 = (short) c; // Requires explicit cast due to potential loss of information
        char cc = (char) s;
    }

    void charToUnicode() {
        char c = 'a';
        String unicode = String.format("\\u%04x", (int)c);
        System.out.println(unicode); // \u0061
    }

    void bitwiseChar() {
        char result = 'c' | 'd';  //bitwise or
        System.out.println(result);  //g
        result = 'c' & 'd';  //bitwise and
        System.out.println(result);  // `
    }
}
