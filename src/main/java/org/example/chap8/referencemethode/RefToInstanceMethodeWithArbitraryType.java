package org.example.chap8.referencemethode;

import java.util.Arrays;
import java.util.List;

public class RefToInstanceMethodeWithArbitraryType {

    public static void main(String[] args) {
        List<String> mots = Arrays.asList("un", "deux", "trois");
        mots.forEach(System.out::println); // Affiche chaque mot sur une nouvelle ligne
    }
}
