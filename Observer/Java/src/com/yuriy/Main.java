package com.yuriy;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(2);
        ConcreteObserverA observerA = new ConcreteObserverA(subject);
        ConcreteObserverB observerB = new ConcreteObserverB(subject);
        subject.attach(observerA);
        subject.attach(observerB);
        System.out.println("Current value " + subject.getValue());
        System.out.println("Square " + observerA.getValSquared());
        System.out.println("Decremented " + observerB.getValDecremented());
        subject.setValue(3);
        System.out.println("Current value " + subject.getValue());
        System.out.println("Square " + observerA.getValSquared());
        System.out.println("Decremented " + observerB.getValDecremented());
    }
}
