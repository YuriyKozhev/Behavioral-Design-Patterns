package com.yuriy;

public class ConcreteClassB extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Implementing operation 1 in B way");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Implementing operation 2 in B way");
    }
}
