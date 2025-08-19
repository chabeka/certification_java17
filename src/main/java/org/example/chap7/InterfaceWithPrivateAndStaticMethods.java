package org.example.chap7;

/**
 * En Java 9 et versions ultérieures, il est possible de définir des méthodes privées dans les interfaces. Cela permet
 * de partager du code commun entre plusieurs méthodes par défaut ou statiques au sein de l'interface. Voici un exemple
 * illustrant l'utilisation des méthodes privées dans une interface
 *
 *  methodePrivee et methodePriveeStatique sont des méthodes privées qui ne peuvent être appelées directement que
 *  depuis les méthodes par défaut ou statiques de l'interface
 *
 *  Appel des méthodes statiques : Les méthodes statiques définies dans une interface sont appelées en utilisant le nom
 *  de l'interface, comme MonInterface.methodeStatique().
 *
 * Accès aux méthodes statiques : Les méthodes statiques ne peuvent pas être appelées via une instance de la classe qui
 * implémente l'interface. Elles doivent être appelées directement sur l'interface.
 *
 * Utilisation des méthodes statiques : Les méthodes statiques dans les interfaces sont souvent utilisées pour fournir
 * des méthodes utilitaires ou des méthodes de fabrique qui sont liées à l'interface.
 */
public interface InterfaceWithPrivateAndStaticMethods {

    //interface variables are implicitly : public, static, final
    int x =5;
    // does not compile
    //int y;

    // Méthode par défaut utilisant une méthode privée
    default void methodeParDefaut() {
        System.out.println("Appel de methodeParDefaut de l'interface");
        methodePrivee();
    }

    // Méthode par défaut utilisant une méthode privée
    default void autreMethodeParDefaut() {
        System.out.println("Appel de voidautreMethodeParDefaut de l'interface");
    }

    // Méthode statique utilisant une méthode privée
    static void methodeStatique() {
        System.out.println("Appel de methodeStatique");
        methodePriveeStatique();
    }

    // Méthode statique utilisant une méthode privée
    static void autreMethodeStatique() {
        System.out.println("Appel de autreMethodeStatique");
        //methodePriveeStatique();
    }

    // Méthode privée
    private void methodePrivee() {
        System.out.println("Appel de methodePrivee");
    }

    // Méthode privée statique
    private static void methodePriveeStatique() {
        System.out.println("Appel de methodePriveeStatique");
    }
}
