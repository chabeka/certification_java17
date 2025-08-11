package org.example.chap5;

/**
 * En Java, le terme "effectively final" (effectivement final) fait référence à une variable locale qui n'est pas
 * explicitement déclarée comme final, mais dont la valeur ne change pas après son initialisation. Ce concept est
 * particulièrement pertinent dans le contexte des expressions lambda et des classes anonymes, où les variables locales
 * utilisées doivent être effectivement finales.
 *
 * Pourquoi "effectively final" ?
 * Les variables locales utilisées dans les expressions lambda et les classes anonymes doivent être effectivement
 * finales pour garantir que leur valeur ne change pas après leur initialisation. Cela permet de s'assurer que l'état
 * de la variable est constant et prévisible lorsque l'expression lambda ou la classe anonyme est exécutée.
 */
public class EffectivelyFinalExample {

    public static void main(String[] args) {
        int number = 10; // Variable locale effectivement finale

        // Utilisation de la variable dans une classe anonyme
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Le nombre est : " + number);
            }
        };

        runnable.run();

        // Utilisation de la variable dans une expression lambda
        Runnable runnable1 = () -> System.out.println("Le nombre est : " + number);

        runnable1.run();
    }
}
