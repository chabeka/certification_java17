package org.example.chap2;

/**
 * les opérations unaires sont des opérations qui s'appliquent à un seul opérande.
 * Elles sont utilisées pour effectuer des transformations simples sur des variables
 */
public class UnaryOperatorsExample {

    public static void main(String[] args) {
        // Opérateur de négation (-) : Utilisé pour inverser le signe d'une valeur numérique
        int a = 5;
        int b = -a;
        System.out.println("Négation : " + b); // Affiche -5

        // Opérateur de complément (~) : Utilisé pour inverser tous les bits d'un entier (opération de complément à un)
         a = 5; // En binaire : 00000000 00000000 00000000 00000101
         b = ~a; // En binaire : 11111111 11111111 11111111 11111010
        System.out.println(b); // Affiche -6

        // Opérateur de négation logique : Utilisé pour inverser la valeur d'un booléen
        boolean flag = true;
        boolean notFlag = !flag;
        System.out.println("Négation logique : " + notFlag); // Affiche false

        // Opérateur d'incrément : Utilisé pour augmenter la valeur d'une variable de 1.
        //Pré-incrémentation (++variable) : Incrémente la variable avant de l'utiliser.
        int e = 5;
        int f = ++e;
        System.out.println("Pré-incrémentation : " + f); // Affiche 6

        // Post-incrémentation (variable++) : Incrémente la variable après l'avoir utilisée.
        int g = e++;
        System.out.println("Post-incrémentation : " + g); // Affiche 6
        System.out.println("Valeur après post-incrémentation : " + e); // Affiche 7

        // Opérateur de décrément
        int h = 5;
        int i = --h;
        System.out.println("Pré-décrémentation : " + i); // Affiche 4
        int j = h--;
        System.out.println("Post-décrémentation : " + j); // Affiche 4
        System.out.println("Valeur après post-décrémentation : " + h); // Affiche 3

        var aLong = 2L;
        //but I can apply to a long
        aLong = ~aLong;
        System.out.println(" aLong " + aLong);

        Object obj = aLong;
        System.out.println(obj.getClass().getName());
    }

    void bitwiseToDifferentTypes() {
        var b = false;
        //does not compile!
        //var a = ~b;
        var aDouble = 3.2D;
        //does not compile
        //aDouble = ~aDouble;

        short s = 1234;
        //not even for short
        //s = ~s;

        var aLong = 2L;
        //but I can apply to a long
        aLong = ~aLong;

        Object obj = aLong;
        System.out.println(obj.getClass().getName());
    }
}
