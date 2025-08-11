package org.example.chap6.blocinitialization;

public class ParentBlocStaticEtInstance {
    // Static block in the Animal class
    static {
        System.out.print("A");
    }

    // Instance block in the Animal class
    {
        System.out.print("B");
    }

    ParentBlocStaticEtInstance(String name) {
        this(1);
        System.out.print("C");
    }

    ParentBlocStaticEtInstance(int a) {
        System.out.print("D");
    }

    ParentBlocStaticEtInstance() {
        System.out.print("E");
    }
}
