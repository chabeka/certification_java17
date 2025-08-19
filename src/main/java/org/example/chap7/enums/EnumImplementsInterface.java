package org.example.chap7.enums;

import java.math.BigDecimal;

public enum EnumImplementsInterface implements Richesse{
    RICHE,
    PAUVRE,
    NORMALE;

    @Override
    public BigDecimal getFortune() {
        return null;
    }
}

interface Richesse {
    BigDecimal getFortune();
}