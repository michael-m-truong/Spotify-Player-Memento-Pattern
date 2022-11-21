package org.example;

import org.example.interfaces.Caretaker;
import org.example.interfaces.Memento;

import java.util.Stack;

public class SpotifyApp implements Caretaker {

    Stack<Memento> songHistory = new Stack<>();
    
    /** Saves to played history */
    //@Override
    public void addMemento(Memento memento) {
        songHistory.push(memento);
    }

    //@Override
    public Memento getMemento() {
        return songHistory.pop();
    }
    
}
