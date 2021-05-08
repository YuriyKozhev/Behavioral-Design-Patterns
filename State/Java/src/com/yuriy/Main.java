package com.yuriy;

public class Main {

    public static void main(String[] args) {
        ConcreteStateA stateA = new ConcreteStateA();
        ConcreteStateB stateB = new ConcreteStateB();

        Context context = new Context();

        context.setState(stateA);
        context.request();

        context.setState(stateB);
        context.request();
    }
}
