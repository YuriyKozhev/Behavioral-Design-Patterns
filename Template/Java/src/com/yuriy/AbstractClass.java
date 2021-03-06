package com.yuriy;

public abstract class AbstractClass {
    public void execute() {
        System.out.println("Starting execution");
        primitiveOperation1();
        primitiveOperation2();
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
