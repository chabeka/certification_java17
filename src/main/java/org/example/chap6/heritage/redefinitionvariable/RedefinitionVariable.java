package org.example.chap6.heritage.redefinitionvariable;

public class RedefinitionVariable {

    public static void main(String[] args) {
        Francais fr = new Francais();
        Language lan = fr;
        System.out.println(fr.a);  //20
        System.out.println(lan.a); //10
        fr.printDetails();
    }

}
