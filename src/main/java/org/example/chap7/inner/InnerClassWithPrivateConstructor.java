package org.example.chap7.inner;

/**
 * il est possible de créer une instance d'une classe interne avec un constructeur privé en utilisant une méthode
 * publique de la classe externe qui accède au constructeur privé de la classe interne
 */
public class InnerClassWithPrivateConstructor {
    // Déclaration de la classe interne
    private class InnerClass {
        private String message;

        // Constructeur privé de la classe interne
        private InnerClass(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    // Méthode publique de la classe externe pour créer une instance de la classe interne
    public InnerClass createInnerClassInstance(String message) {
        return new InnerClass(message);
    }

    private InnerClass createInnerClassInstanceWithPrivateMethode(String message) {
        return new InnerClass(message);
    }

    public static void main(String[] args) {
        InnerClassWithPrivateConstructor outer = new InnerClassWithPrivateConstructor();
        // Utilisation de la méthode publique pour créer une instance de la classe interne
        InnerClass inner = outer.createInnerClassInstance("Hello, World!");
        System.out.println(inner.getMessage());

        InnerClass innerClass2 = outer.createInnerClassInstanceWithPrivateMethode("private methode");
        System.out.println(innerClass2.getMessage());
        //
        InnerClass inner1 = new InnerClassWithPrivateConstructor().new InnerClass("message");


    }
}
