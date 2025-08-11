package org.example.chap5;

/**
 * Varargs : Si aucune correspondance exacte n'est trouvée, le compilateur peut utiliser une méthode avec des
 * paramètres varargs (par exemple, print(int... numbers)).
 */
public class OverloadingVarargsExample {


    public static void main(String[] args) {
        OverloadingVarargsExample example = new OverloadingVarargsExample();

        // Appel de la méthode avec des paramètres varargs
        example.print(1, 2, 3, 4, 5);

        example.method(1, 1.2);  // Object obj1, Object obj2
        example.method(1, 2); // int n1, int n2
        example.method(1.3, 2.3); // Object obj1, Object obj2
        example.method(1.3F, 2.3F); // float f1, float f2
        example.method(Float.valueOf(1.3f)); // float... vararg
        example.method(Float.valueOf(1.3f), Float.valueOf(5.2F)); // Float f1, Float f2
        example.method(1.3F); // float... vararg
        example.method(); // float... vararg


        //in this case I call : two args
        example.moo(2, new int[]{1});
        //in this case I call : one arg
        example.moo(new int[]{1});
        //Ambiguous method call. DO not compile
        //example.moo(3);
    }

    // Méthode avec des paramètres varargs
    public void print(int... numbers) {
        System.out.println("Nombres varargs : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    void method(float f1, float f2) {
        System.out.println("float f1, float f2");
    }

    void method(int n1, int n2) {
        System.out.println("int n1, int n2");
    }

    void method(float... vararg) {
        System.out.println("float... vararg");
    }

    void method(Float f1, Float f2) {
        System.out.println("Float f1, Float f2");
    }

    void method(Object obj1, Object obj2) {
        System.out.println("Object obj1, Object obj2");
    }

    public void moo(int m, int... n) {
        System.out.println("two args");
    }

    private void moo(int... x) {
        System.out.println("one arg");

    }
}
