package org.example.chap7.local;

public class LocalClassWithAttributeNameInConflict {

    public static void main(String[] args) {
        int sum = new LocalClassWithAttributeNameInConflict().sum();
        System.out.println(sum);
    }

    public int sum() {
        final int op = 5;
        class Math {

            int localSum() {
                //how to access to the op defined in the enclosed method?
                // final int op = 5;
                int op = 10;
                return op;
            }
        }
        return new Math().localSum();
    }
}
