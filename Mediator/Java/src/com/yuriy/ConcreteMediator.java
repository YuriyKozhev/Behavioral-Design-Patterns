package com.yuriy;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void mediate(Colleague colleague) {
        if (colleague == colleagueA && colleagueA.getValueA() > 1)
            colleagueB.setValueB(1);
    }
}
