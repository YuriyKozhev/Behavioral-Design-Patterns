package com.yuriy;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Applying for element A");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Applying for element B");
    }
}
