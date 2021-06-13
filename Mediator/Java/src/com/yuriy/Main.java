package com.yuriy;

public class Main {

    public static void main(String[] args) {
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
