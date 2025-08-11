package org.example.chap5;

/**
 * Promotion des types primitifs : Si une correspondance exacte n'est pas trouvée, le compilateur peut promouvoir
 * les types primitifs (par exemple, un int peut être promu en long, float, ou double).
 */
public class OverloadingPromoteTypePrimitiveExample {

    public static void main(String[] args) {
        OverloadingPromoteTypePrimitiveExample example = new OverloadingPromoteTypePrimitiveExample();

        // Appel de la méthode avec un paramètre int
        // Le compilateur choisit la méthode avec le paramètre long (promotion des types primitifs)
        example.print(5);

        // Appel de la méthode avec un paramètre Integer (autoboxing)
        example.print(Integer.valueOf(5));

        // Appel de la methode avec paramètre Double
        example.choose(2F);  //double

        // Appel de la methode avec paramètre Short
        example.choose((byte) (2 + 1));  //short

        // Appel de la methode avec paramètre Double
        //byte+int = int
        example.choose((byte) 2 + 1);  //int

        // Promotion de int en float
        example.method(4);
    }

    // Méthode avec un paramètre long
    public void print(long number) {
        System.out.println("Nombre long : " + number);
    }

    // Méthode avec un paramètre Integer
    public void print(Integer number) {
        System.out.println("Nombre Integer : " + number);
    }

    private void choose(int choice) {
        System.out.println("int");
    }

    private void choose(short choice) {
        System.out.println("short");
    }

    private void choose(long choice) {
        System.out.println("long");
    }

    private void choose(double choice) {
        System.out.println("double");
    }

    private void choose(Float choice) {
        System.out.println("Float");
    }

    void method(double d) {
        System.out.println("double");
    }

    void method(float d) {
        System.out.println("float");
    }
}
