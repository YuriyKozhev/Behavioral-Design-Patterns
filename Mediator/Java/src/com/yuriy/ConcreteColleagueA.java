package com.yuriy;

public class ConcreteColleagueA extends Colleague {
    private int valueA;

    public ConcreteColleagueA(Mediator owner) {
        super(owner);
        valueA = 0;
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
        owner.mediate(this);
    }
}
