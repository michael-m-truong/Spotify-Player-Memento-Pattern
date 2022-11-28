package org.example.interfaces;

// Caretaker interface to implement Memento pattern
public interface Caretaker<T extends Memento<?>> {
    void addMemento(T memento);
    T getMemento();
}
