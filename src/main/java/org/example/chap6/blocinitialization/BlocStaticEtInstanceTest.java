package org.example.chap6.blocinitialization;

public class BlocStaticEtInstanceTest {

    public static void main( String[] args) {
        ParentBlocStaticEtInstance animal = new ParentBlocStaticEtInstance(1); // print ABD
        System.out.println();
        ChildBlocStaticEtInstance child = new ChildBlocStaticEtInstance(5); // print FBDCGH

        ChildBlocStaticEtInstance child2 = new ChildBlocStaticEtInstance(5); // print BDCGH

    }

}
