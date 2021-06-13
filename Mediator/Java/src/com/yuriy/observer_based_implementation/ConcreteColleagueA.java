package com.yuriy.observer_based_implementation;

public class ConcreteColleagueA extends Colleague {
    private int valueA = 0;

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
        update();
    }

    @Override
    public void update() {

    }
}
