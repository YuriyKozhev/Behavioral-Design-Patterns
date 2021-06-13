package com.yuriy.observer_based_implementation;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void attach(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void inform() {
        colleagues.forEach(Colleague::update);
    }
}
