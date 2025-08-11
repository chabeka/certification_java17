package org.example.chap4;

public class Tableau2Dimension {

    public static void main(String[] args) {
        new Tableau2Dimension().creation();
    }

    void creation() {

        int[][] tab1; // Déclaration d'un tableau à deux dimensions d'entiers

        //Allocation de mémoire :
        tab1 = new int[3][4]; // Création d'un tableau de 3 lignes et 4 colonnes

        //Déclaration et allocation combinées :
        int[][] tab2 = new int[3][4]; // Déclaration et création d'un tableau de 3 lignes et 4 colonnes
        int[] tab20 = new int []{1,2,3,4};
        tab2[0] = tab20;
        tab2[1] = new int[] {1, 2, 3};
        tab2[2] = new int[] {1, 2, 3,4, 6,23,12,11,123};
        // ERROR : Index 3 out of bounds for length 3 => lorsque le nombre de ligne depasse ce qui a été declaré
        //tab2[3] = new int[] {1, 2, 3,4,5};

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                System.out.println("Element à l'index [" + i + "][" + j + "] : " + tab2[i][j]);
            }
        }
        //Initialisation avec des valeurs :
        int[][] tab3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        }; // Déclaration et initialisation avec des valeurs


        // Autre façon d'initialiser
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[][]{
                                 {1, 2, 3},
                                 {1, 3, 5}
                                };
        //bizare mais valide
        int[] m3[] = new int[3][3];

        int m4[][] = new int[3][3];

        // initialisation en erreur : on ne pas pas indiquer seulement la 2eme dimension sans la 1ière
        // int[][] tab6 = new int[][4];

        // ERROR : les dimensions sont indiquées du coté gauche de "="
        // int[3][3] tab6 = new int[][];

    }

    void tab2DDilemme(){
        // Il n'y a pas de tableaux multidimensionnels en Java.
        // String[][] Décrit un tableau unidimensionnel de tableaux unidimensionnels.
        // Il n'est pas nécessaire que chaque sous-tableau ait la même longueur.

        String[][] tab = new String[2][2];

        // signifie :
        String[][] arr = new String[2][];
        arr[0] = new String[2];
        arr[1] = new String[2];
        String a[] = { "1", "2", "3", "4", "5" };
        arr[0] = a; //Réaffecte la référence d'un tableau de chaînes à deux éléments à un autre à cinq éléments.
                    // Le tableau à deux éléments n'est plus référencé et est parfois GC.

        // Pour copier des éléments a à arr utiliser :
        System.arraycopy(a, 0, arr[0], 0, a.length);
        //Ce qui va lever l'exception.
    }
}
