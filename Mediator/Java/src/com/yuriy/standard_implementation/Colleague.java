package com.yuriy.standard_implementation;

public abstract class Colleague {
    protected final Mediator owner;

    public Colleague(Mediator owner) {
        this.owner = owner;
    }
}
