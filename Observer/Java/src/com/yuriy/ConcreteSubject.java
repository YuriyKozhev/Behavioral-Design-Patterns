package com.yuriy;

public class ConcreteSubject extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        inform();
    }
}
