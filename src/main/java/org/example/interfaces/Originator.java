package org.example.interfaces;

public interface Originator {

    void setMemento(Memento memento);

    Memento createMemento();

    /* may not need this interface but just in case*/
}