package org.example.chap2;

/**
 * Les opérateurs composés en Java sont des opérateurs qui combinent
 * une opération arithmétique avec une opération d'affectation
 * += : Addition et affectation
 * -= : Soustraction et affectation
 * *= : Multiplication et affectation
 * /= : Division et affectation
 * %= : Modulo et affectation
 * &= : ET bit à bit et affectation
 * |= : OU bit à bit et affectation
 * ^= : OU exclusif (XOR) bit à bit et affectation
 * <<= : Décalage à gauche et affectation
 * >>= : Décalage à droite et affectation
 * >>>= : Décalage à droite sans signe et affectation
 */
public class CompoundOperator {
    public static void main(String[] args) {
        int a = 5;

        // Addition et affectation
        a += 3;
        System.out.println("a += 3: " + a); // Affiche: 8

        // Soustraction et affectation
        a -= 2;
        System.out.println("a -= 2: " + a); // Affiche: 6

        // Multiplication et affectation
        a *= 2;
        System.out.println("a *= 2: " + a); // Affiche: 12

        // Division et affectation
        a /= 3;
        System.out.println("a /= 3: " + a); // Affiche: 4

        // Modulo et affectation
        a %= 3;
        System.out.println("a %= 3: " + a); // Affiche: 1

        // ET bit à bit et affectation
        a &= 3;
        System.out.println("a &= 3: " + a); // Affiche: 1

        // OU bit à bit et affectation
        a |= 2;
        System.out.println("a |= 2: " + a); // Affiche: 3

        // OU exclusif (XOR) bit à bit et affectation
        a ^= 1;
        System.out.println("a ^= 1: " + a); // Affiche: 2

        // Décalage à gauche et affectation
        a <<= 1;
        System.out.println("a <<= 1: " + a); // Affiche: 4

        // Décalage à droite et affectation
        a >>= 1;
        System.out.println("a >>= 1: " + a); // Affiche: 2

        // Décalage à droite sans signe et affectation
        a = -5;
        a >>>= 1;
        System.out.println("a >>>= 1: " + a); // Affiche: 2147483645
    }
    void trickyCompound() {
        long quantity = 10L;
        int cost = 5;
        //this does not compile as I would need long LHS
        //cost = cost * quantity;  //DOES NOT COMPILE!
        //this works with compound operator
        cost *= quantity;
        System.out.println(cost); //50
    }

    void assignment() {
        long quantity;
        long number = (quantity = 3L);
        System.out.println(number);  //3
        System.out.println(quantity); //3
    }

    void compoundIntLong() {
        int anInt =5;
        long aLong = 6;
        //DOES NOT COMPILE
        //int result = anInt + aLong;
        int result = anInt;
        //minor warning: Implicit cast from 'long' to 'int' in compound assignment can be lossy
        result +=aLong;
        System.out.println(result);  //11
    }

    void trickyAssignment() {
        boolean a = false;
        //this condition is true as to a is assigned the value true;
        if (a = true) {
            System.out.println("tricky one");
        }
    }
}
