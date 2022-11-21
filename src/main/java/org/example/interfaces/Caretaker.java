package org.example.interfaces;

public interface Caretaker<T extends Memento<?>> {
    void addMemento(T memento);

    T getMemento();
}
