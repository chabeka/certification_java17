package org.example.chap7.inner;

public class AccessToInnerClassFromAStaticMethod {
    interface InterInter {

    }

    class InnerClass {
        void message(String s) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        // DOES NOT COMPILE :  cannot be referenced from a static context
        //InnerClass innerClass = new InnerClass()

        InnerClass innerClass = new AccessToInnerClassFromAStaticMethod().new InnerClass();
        innerClass.message("");
    }
}
