package org.example;

public interface Originator {

    void setMemento(Memento memento);

    Memento createMemento();

    /* may not need this interface but just in case*/
}