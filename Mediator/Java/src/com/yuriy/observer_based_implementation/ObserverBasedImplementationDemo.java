package com.yuriy.observer_based_implementation;

public class ObserverBasedImplementationDemo {
    public static void show() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA();
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(colleagueA);
        mediator.attach(colleagueA);
        mediator.attach(colleagueB);
        System.out.println(colleagueB.getValueB());
        colleagueA.setValueA(10);
        System.out.println(colleagueB.getValueB());
    }
}
