package org.example.chap2;

public class ByteExample {

    public static void main(String[] args) {
        System.out.println(new ByteExample());
        // Déclaration et initialisation
        byte a = 100;
        byte b = -50;
        byte c = 127;  // Valeur maximale
        byte d = -128; // Valeur minimale

        // Opérations arithmétiques
        byte sum = (byte) (a + b);
        byte difference = (byte) (a - b);
        byte product = (byte) (a * b);
        byte quotient = (byte) (a / 2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Conversion entre types
        int i = a;
        byte bConverted = (byte) i;

        System.out.println("Converted int to byte: " + bConverted);

        // Utilisation dans les tableaux
        byte[] byteArray = {10, 20, 30, 40, 50};
        for (byte value : byteArray) {
            System.out.println("Array value: " + value);
        }

        // Utilisation avec les classes utilitaires
        String str = Byte.toString(a);
        byte parsedByte = Byte.parseByte("50");

        System.out.println("String representation: " + str);
        System.out.println("Parsed byte: " + parsedByte);
        System.out.println("Max value: " + Byte.MAX_VALUE);
        System.out.println("Min value: " + Byte.MIN_VALUE);
    }
    public int hashcode(){
        return 100;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    abstract static class animal{
        abstract void b();
    }
}
