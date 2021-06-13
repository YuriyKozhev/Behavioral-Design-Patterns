package com.yuriy.observer_based_implementation;

public class ConcreteColleagueB extends Colleague {
    private int valueB = 0;
    private ConcreteColleagueA colleagueA;

    public ConcreteColleagueB(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
        update();
    }

    @Override
    public void update() {
        if (colleagueA.getValueA() > 0)
            valueB = 1;
    }
}
