package com.yuriy.observer_based_implementation;

public interface Mediator {
    void attach(Colleague colleague);
    void inform();
}
