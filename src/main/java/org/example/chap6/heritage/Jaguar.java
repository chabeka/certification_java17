package org.example.chap6.heritage;

public class Jaguar extends Felin implements Run{

    /*
    getSpeed()' in 'org.example.chap6.heritage.Jaguar' clashes with 'getSpeed()'
    in 'org.example.chap6.heritage.Felin'; attempting to use incompatible return type
    @Override
    public Number getSpeed() {
        return null;
    }
    */

    //this does compile as Long is a covariant of Number
    @Override
    public Long getSpeed() {
        return 10L;
    }
}
