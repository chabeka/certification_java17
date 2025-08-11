package org.example.chap4.string;

import static org.example.TextHelper.wrap;

public class StripString {

    static final char space = '\u0020';
    static final String original = space + "12345" + space;

    public static void main(String[] args) {
        StripString instance = new StripString();
        //instance.strip();
        //instance.stripIndent();
        instance.strip2();

    }

    /**
     * Renvoie une chaîne dont la valeur est cette chaîne, avec tous les espaces blancs de début et de fin supprimés.
     */
    void strip() {
        String strip = original.strip();
        //before: # 12345 # - after: #12345#
        System.out.println("before: %s - after: %s".formatted(wrap(original), wrap(strip)));
    }

    void stripIndent() {
        String stripIndent = original.stripIndent();
        //before: # 12345 # - after: #12345#
        System.out.println("before: %s - after: %s".formatted(wrap(original), wrap(stripIndent)));
    }

    void stripLeading() {
        String stripLeading = original.stripLeading();
        //before: # 12345 # - after: #12345 #
        System.out.println("before: %s - after: %s".formatted(wrap(original), wrap(stripLeading)));
    }

    void stripTrailing() {
        String stripTrailing = original.stripTrailing();
        //before: # 12345 # - after: # 12345#
        System.out.println("before: %s - after: %s".formatted(wrap(original), wrap(stripTrailing)));
    }

    void strip2() {
        String text = "\t   a b c\n";
        //<	   a b c
        //>
        System.out.println(wrap(text));
        var strip = text.strip();
        //<a b c>
        System.out.println(wrap(strip));

        strip = text.stripIndent();
        System.out.println(wrap(strip));

    }
}
