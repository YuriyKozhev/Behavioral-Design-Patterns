package com.yuriy;

public abstract class AbstractClass {
    void execute() {
        System.out.println("Starting execution");
        primitiveOperation1();
        primitiveOperation2();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();
}
