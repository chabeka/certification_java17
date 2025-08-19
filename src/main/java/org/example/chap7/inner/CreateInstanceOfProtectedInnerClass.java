package org.example.chap7.inner;

public class CreateInstanceOfProtectedInnerClass {
    private int butter = 5;

    private CreateInstanceOfProtectedInnerClass() {
    }

    public static void main(String[] args) {
        CreateInstanceOfProtectedInnerClass.Popcorn in = new CreateInstanceOfProtectedInnerClass().new Popcorn();
        in.startMovie();  //10
    }

    protected class Popcorn {

        public static int butter = 10;

        private Popcorn() {
        }

        public void startMovie() {
            System.out.println(butter);
        }
    }
}
