package org.example;

import org.example.interfaces.Caretaker;
import org.example.interfaces.Memento;
import org.example.models.Song;

import java.util.Stack;

public class SpotifyApp implements Caretaker<Song> {
    // stack to hold Song instances
    Stack<Song> songHistory = new Stack<>();

    /**
     * Add Song instance to the stack
     * Override method from Caretaker interface
     * @param memento Song instance to be added to the stack
     */
    @Override
    public void addMemento(Song memento) {
        songHistory.push(memento);
    }

    /**
     * Get the Song at the top of the stack
     * and remove the Song from the stack
     * Override method from Caretaker interface
     */
    @Override
    public Song getMemento() {
        return songHistory.pop();
    }
}
