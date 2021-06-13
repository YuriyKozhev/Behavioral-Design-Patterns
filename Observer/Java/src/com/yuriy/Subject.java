package com.yuriy;

public interface Subject {
    void attach(Observer obs);
    void detach(Observer obs);
    void inform();
}
