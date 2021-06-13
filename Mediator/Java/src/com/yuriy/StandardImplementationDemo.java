package com.yuriy;

public class StandardImplementationDemo {
    public static void show() {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        System.out.println(colleagueB.getValueB());
        colleagueA.setValueA(10);
        System.out.println(colleagueB.getValueB());
    }
}
