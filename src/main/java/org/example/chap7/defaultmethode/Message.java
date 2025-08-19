package org.example.chap7.defaultmethode;

public interface Message {
    default void hello() {
    }

    default Number getNbMessage() {
        return 10;
    }

    default int getLongeurMessage() {
        return  10;
    }

}
