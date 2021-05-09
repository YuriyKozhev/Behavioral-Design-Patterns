package com.yuriy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.request();

        context.setStrategy(new StrategyB());
        context.request();
    }
}
