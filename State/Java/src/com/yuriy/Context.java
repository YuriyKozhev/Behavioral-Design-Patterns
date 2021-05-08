package com.yuriy;

public class Context {
    private State state;

    public void request() {
        state.handle();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
