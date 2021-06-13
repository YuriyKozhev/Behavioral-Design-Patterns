package com.yuriy;

public class ConcreteColleagueB extends Colleague {
    private int valueB;

    public ConcreteColleagueB(Mediator owner) {
        super(owner);
        valueB = 0;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
        owner.mediate(this);
    }
}
