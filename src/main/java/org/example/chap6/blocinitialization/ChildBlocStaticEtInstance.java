package org.example.chap6.blocinitialization;

public class ChildBlocStaticEtInstance extends ParentBlocStaticEtInstance{

    // Static block in the Cat class
    static {
        System.out.print("F");
    }

    // Instance block in the Cat class
    {
        System.out.print("G");
    }

    ChildBlocStaticEtInstance(int age) {
        super("super");
        System.out.println("H");
    }
}
