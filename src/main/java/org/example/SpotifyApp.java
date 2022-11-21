package org.example;

import org.example.interfaces.Caretaker;
import org.example.interfaces.Memento;

import java.util.Stack;

public class SpotifyApp implements Caretaker {
    Stack<Memento> songHistory = new Stack<>();

    public void addMemento(Memento memento) {
        songHistory.push(memento);
    }

    public Memento getMemento() {
        return songHistory.pop();
    }
}
