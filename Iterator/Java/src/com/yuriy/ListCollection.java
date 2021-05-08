package com.yuriy;

import java.util.List;

public class ListCollection<T> implements Collection<T>{
    public List<T> list;

    public ListCollection(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ForwardIterator();
    }

    private class ForwardIterator implements Iterator<T> {
        private int index;

        @Override
        public T current() {
            return list.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public void next() {
            index++;
        }
    }
}
