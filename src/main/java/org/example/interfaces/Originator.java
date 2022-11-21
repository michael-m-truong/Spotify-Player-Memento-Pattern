package org.example.interfaces;

public interface Originator<T extends Memento<?>> {
    void setMemento(T memento);
    T createMemento();
}