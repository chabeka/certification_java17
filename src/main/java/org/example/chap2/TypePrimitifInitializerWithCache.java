package org.example.chap2;

/**
 * Les objets wrapper pour les types primitifs (comme Integer, Boolean, etc.) utilisent un mécanisme de cache pour
 * certaines valeurs afin d'améliorer les performances et économiser de la mémoire. Ce mécanisme est particulièrement
 * pertinent pour les types Integer, Byte, Short, Character, et Boolean.
 *
 * Cache pour autres types
 * Le mécanisme de cache fonctionne de manière similaire pour les autres types primitifs wrappers :
 *
 *   Byte : Toutes les valeurs de Byte sont mises en cache.
 *   Short : Les valeurs de -128 à 127 sont mises en cache.
 *   Character : Les valeurs de \u0000 à \u007F (0 à 127) sont mises en cache.
 *   Boolean : Les valeurs true et false sont mises en cache.
 */
public class TypePrimitifInitializerWithCache {

    public static void main(String[] args) {
        // Valeurs dans la plage de cache (-128 à 127)
        Integer int1 = 100;
        Integer int2 = 100;

        // Valeurs en dehors de la plage de cache
        Integer int3 = 200;
        Integer int4 = 200;

        // Comparaison avec ==
        System.out.println("int1 == int2: " + (int1 == int2)); // true, car les valeurs sont dans le cache
        System.out.println("int3 == int4: " + (int3 == int4)); // false, car les valeurs ne sont pas dans le cache

        // Comparaison avec equals()
        System.out.println("int1.equals(int2): " + int1.equals(int2)); // true
        System.out.println("int3.equals(int4): " + int3.equals(int4)); // true


        Boolean bool1 = true;
        Boolean bool2 = true;
        Boolean bool3 = false;
        Boolean bool4 = false;

        // Comparaison avec ==
        System.out.println("bool1 == bool2: " + (bool1 == bool2)); // true, car les valeurs sont mises en cache
        System.out.println("bool3 == bool4: " + (bool3 == bool4)); // true, car les valeurs sont mises en cache

        // Comparaison avec equals()
        System.out.println("bool1.equals(bool2): " + bool1.equals(bool2)); // true
        System.out.println("bool3.equals(bool4): " + bool3.equals(bool4)); // true
    }
}
