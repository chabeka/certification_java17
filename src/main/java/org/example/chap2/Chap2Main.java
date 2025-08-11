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

        long l = 12L;
        Long ll = 13L;
        long lll = 10;
        Long l4 = Long.valueOf(11);

        double d = 1.2D;
        Double D = 1.3D;
        Double D2 = 1.3;
        double d1 = 1.4;


        float f = 1.2f;
        Float F = 1.3F;
        Float F2 = 1.4F;
        float f2 = 1.2F;

    }
}
