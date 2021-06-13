package com.yuriy;

public class ConcreteMediator implements Mediator {
    ConcreteColleagueA colleagueA = new ConcreteColleagueA(this);
    ConcreteColleagueB colleagueB = new ConcreteColleagueB(this);

    @Override
    public void mediate(Colleague colleague) {
        if (colleague == colleagueA && colleagueA.getValueA() > 1)
            colleagueB.setValueB(1);
    }
}
