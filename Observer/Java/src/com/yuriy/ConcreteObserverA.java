package com.yuriy;

public class ConcreteObserverA implements Observer {
    private int valSquared;
    private final ConcreteSubject subject;

    public ConcreteObserverA(ConcreteSubject subject) {
        this.subject = subject;
        update();
    }

    public int getValSquared() {
        return valSquared;
    }

    @Override
    public void update() {
        valSquared = (int) Math.pow(subject.getValue(), 2);
    }
}
