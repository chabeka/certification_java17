package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String... args){
        Wildcard card = new Wildcard();
        List<?> list = new ArrayList<>();
        ArrayList<? extends Number> lists = new ArrayList<Integer>();
        card.showSize(lists);
    }
}