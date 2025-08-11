package org.example.chap6;

import java.util.ArrayList;
import java.util.List;

public class Immuable {
    private final String name;
    private final List<Integer> listInt;
    public Immuable(String name, List list) {
        this.name = name;
        this.listInt = new ArrayList<>(list);
    }

    List<Integer> getList() {
        return new ArrayList<>(listInt);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        Immuable immuable = new Immuable("name", list);

        System.out.println(immuable.name);
        System.out.println(immuable.listInt.size());

        list.add(6);
        //immuable.name = "toto"; NOT COMPILE ! Cannot assign a value to final variable 'name'
        System.out.println(immuable.listInt.size());
    }
}
