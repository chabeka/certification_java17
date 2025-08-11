package org.example.chap4;

public class Tableau1Dimension {

    public static void main(String[] args) {
        new Tableau1Dimension().reference();

        int[] tableau = {1, 2, 3, 4};
        modifierTableau(tableau);

        // Affichage du tableau après modification
        System.out.println("tableau[0] : " + tableau[0]); // Affiche 10
    }

    void creation() {
        int[] tab1; // Déclaration d'un tableau d'entiers

        // Allocation de mémoire
        tab1 = new int[5]; // Création d'un tableau de 5 entiers

        // Déclaration et allocation combinées
        int[] tab2 = new int[5]; // Déclaration et création d'un tableau de 5 entiers

        // Initialisation avec des valeurs
        int[] tab3 = {1, 2, 3, 4, 5}; // Déclaration et initialisation avec des valeurs

        // D'autre forme d'initialisation
        int tab4[] = new int[10];
        int tab5[] = new int[]{};

        String tab [] = new String[10];

        // ERREUR => erreur de compilation lors de l'initialisation
        // []int str = new int[];

        int[] a;
        // ERREUR => Array initializer is not allowed here
        //a = {1,2,3};
        a = new int[]{1,2,3,4};

        String[] str = new String[3];
        str[0] = "AA";
        str[1] = "BB";
        str[2] = "CC";
        // Index 3 out of bounds for length 3
        str[3] = "DD";
    }

    void reference() {
        int[][] matrix = new int[10][10];
        matrix[0][0] = 25;
        Object[] reference = matrix;
        int[] array = (int[]) reference[0];
        System.out.println(array[0]);
    }

    void ExempleReferenceTableau() {

        int[] tableauOriginal = {1, 2, 3, 4};
        int[] tableauCopie = tableauOriginal; // tableauCopie pointe vers le même tableau que tableauOriginal

        // Modification via tableauCopie
        tableauCopie[0] = 10;

        // Affichage des deux tableaux
        System.out.println("tableauOriginal[0] : " + tableauOriginal[0]); // Affiche 10
        System.out.println("tableauCopie[0] : " + tableauCopie[0]); // Affiche 10
    }

    public static void modifierTableau(int[] tab) {
        tab[0] = 10; // Modification du premier élément du tableau
    }

    void ExempleCopieTableau() {
        int[] tableauOriginal = {1, 2, 3, 4};
        int[] tableauCopie = new int[tableauOriginal.length];

        // Copie des éléments
        for (int i = 0; i < tableauOriginal.length; i++) {
            tableauCopie[i] = tableauOriginal[i];
        }

        // Modification via tableauCopie
        tableauCopie[0] = 10;

        // Affichage des deux tableaux
        System.out.println("tableauOriginal[0] : " + tableauOriginal[0]); // Affiche 1
        System.out.println("tableauCopie[0] : " + tableauCopie[0]); // Affiche 10


        // Utilisation de System.arraycopy
        System.arraycopy(tableauOriginal, 0, tableauCopie, 0, tableauOriginal.length);

        // Modification via tableauCopie
        tableauCopie[0] = 10;

        // Affichage des deux tableaux
        System.out.println("tableauOriginal[0] : " + tableauOriginal[0]); // Affiche 1
        System.out.println("tableauCopie[0] : " + tableauCopie[0]); // Affiche 10
    }
}
