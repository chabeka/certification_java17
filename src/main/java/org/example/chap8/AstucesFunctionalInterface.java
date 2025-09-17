package org.example.chap8;

import java.util.function.Predicate;

public class AstucesFunctionalInterface {

    void scope() {
        //before I cannot
        //int x = 4;
        if (true) {
            int x = 5;
        }

        //here the x in the if is no longer in scope
        //so I can define a variable with the same name
        int x = 5;
    }

    void assignLambdaToVar() {
        //here the The compiler does not have enough information to determine they are of type Predicate<String>.
        //var predicate = (s) -> s.isEmpty();

        //Cannot infer type: lambda expression requires an explicit target type
        //var predicate = (String s) -> s.isEmpty();
    }

    void finalParameter() {
        //it's possible to use final!
        Predicate<String> predicate = (final String s) -> false;
    }
}

@FunctionalInterface
interface Territoire {
    int superficie();
    String toString();
    //String region();
}