package org.example.interfaces;

// Originator interface to implement Memento pattern
public interface Originator<T extends Memento<?>> {
    void setMemento(T memento);
    T createMemento();
}