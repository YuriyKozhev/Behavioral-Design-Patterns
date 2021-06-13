package com.yuriy;

public class ConcreteObserverB implements Observer {
    private int valDecremented;
    private final ConcreteSubject subject;

    public ConcreteObserverB(ConcreteSubject subject) {
        this.subject = subject;
        update();
    }

    public int getValDecremented() {
        return valDecremented;
    }

    @Override
    public void update() {
        valDecremented = subject.getValue() - 1;
    }
}
