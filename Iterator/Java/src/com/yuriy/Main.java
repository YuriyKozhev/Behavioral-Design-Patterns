package com.yuriy;

import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> listCollection = new ListCollection<>(List.of(1, 2, 3));

        Iterator<Integer> listIterator = listCollection.createIterator();

        System.out.println("Forward iterating through list");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.current());
            listIterator.next();
        }

        Integer[] array = {1, 2, 3};
        Collection<Integer> arrayCollection = new ArrayCollection<>(array);

        Iterator<Integer> arrayIterator = arrayCollection.createIterator();

        System.out.println("Backward iterating through array");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.current());
            arrayIterator.next();
        }
    }
}
