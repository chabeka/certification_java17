package org.example.chap2;

public class Chap2Main {

    public static void main(String[] args){
        CallingMethodPrimitive call = new CallingMethodPrimitive();
        call.returningALongAsAnInt(12);
        call.returningAnIntAsALong(12);
        call.OverflowExample();

        CastingTypePrimitif cast = new CastingTypePrimitif();
        cast.bitwiseChar();
        cast.charToUnicode();
    }
}
