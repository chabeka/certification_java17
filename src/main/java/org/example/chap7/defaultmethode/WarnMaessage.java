package org.example.chap7.defaultmethode;

public interface WarnMaessage {
    default void hello() {
    }

    default Long getNbMessage() {
        return 10L;
    }

    /*
    default long getLongeurMessage() {
        return  10L;
    }
    */

}
