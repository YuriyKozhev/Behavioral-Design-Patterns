package com.yuriy;

public class ArrayCollection<T> implements Collection<T> {
    private T[] array;

    public ArrayCollection(T[] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> createIterator() {
        return new BackwardIterator();
    }

    private class BackwardIterator implements Iterator<T> {
        private int index = array.length - 1;

        @Override
        public T current() {
            return array[index];
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public void next() {
            index--;
        }
    }
}
