package com.yuriy;

public class ConcreteClassA extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Implementing operation 1 in A way");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Implementing operation 2 in A way");
    }
}
