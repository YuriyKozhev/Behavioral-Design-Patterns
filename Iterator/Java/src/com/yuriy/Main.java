package com.yuriy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> collection = new ListCollection<>(List.of(1, 2, 3));

        Iterator<Integer> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
