package org.example.chap3;

/**
 * Syntaxe de base<br>
 * Initialisation : int i = 1 initialise la variable i à 1.<br>
 * Condition : i <= 5 vérifie que i est inférieur ou égal à 5.<br>
 * Incrémentation : i++ augmente la valeur de i de 1 à chaque itération.
 */
public class ForLoop {

    public static void main(String[] args) {
        new ForLoop().forPreIncrementVsPostIncrement();
        new ForLoop().NestedLoopLabelExample();
        new ForLoop().forLabels();
    }

    void loopWithDouble() {
        for (double x = 0; x < 10; x++) {
            System.out.println(x);
        }
    }

    void forWithContinue() {
        for (int j = 0; j < 10; j++) {
            continue;
            //Unreachable statement
            /*if(j>3){
                System.out.println(j);
            }*/
        }
    }

    void forPreIncrementVsPostIncrement() {
        int[] array = new int[]{5, 10, 15, 20};

        //post increment and pre increment are the same in a for loop
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Lors de la declaration de plusieurs variable dans la boucle "for", toutes les variable doivent être déclarées
     * une seule fois en ligne séparé par des virgule: int i=0, j=0;
     */
    void forMultipleVariables() {
        for (long x = 0, y = 0; x < 10 && y < 10; x++, y++) {
            System.out.println("x: " + x + " - y: " + y);
        }

        //You can declare multiple elements in a for loop, but the data type must be listed only once
        /*for(long x=0, long y=0; x<10 && y<10; x++, y++){
            System.out.println("x: "+x+" - y: "+y);
        }*/
    }

    void multipleVariablesInt() {
        //separation is with comma
        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {

        }
    }


    // Boucle infinie
    void infiniteLoop() {
        for (; ; ) {
            System.out.println("stop me pls!");
        }
    }

    // lorsque le code situé dans le boucle "for" ne eut jamais être atteind, le code ne compile pas
    void loopNotCompiling() {
        int idx = 0;
        for (int j = 0; j < 10; j++) {
            if (idx == 5) {
                break;
            } else {
                continue;
            }
            //this line will never be reached, then the code does not compile
            //System.out.println("never reached");  //does not compile
        }
    }


    void forLabels() {
        outer:
        for (int j = 0; j < 10; j++) {
            inner:
            for (int k = 0; k < 100; k++) {
                //System.out.println("j: "+j+" - k: "+k);
                if (k + j == 7) {
                    System.out.println("break inner");
                    break inner;
                }
                if (k + j == 10) {
                    System.out.println("continue outer");
                    continue outer;
                }
            }
        }
    }
    public void NestedLoopLabelExample() {
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            innerLoop: // Label for the inner loop
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    if (i + j + k > 5) {
                        System.out.println("Breaking out of inner loop when i + j + k > 5");
                        break innerLoop; // Break out of the inner loop
                    }
                    System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
        System.out.println("Exited all loops");

    }
}
