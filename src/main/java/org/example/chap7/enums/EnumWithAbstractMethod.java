package org.example.chap7.enums;

public enum EnumWithAbstractMethod {
    CARRE{
        @Override
        int surface() {
            return 0;
        }
    },
    RECTANGLE{
        @Override
        int surface() {
            return 0;
        }
    },
    CIRCLE{
        @Override
        int surface() {
            return 0;
        }
    };

    abstract int surface();
}

