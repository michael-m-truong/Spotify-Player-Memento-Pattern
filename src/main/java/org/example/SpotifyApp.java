package org.example;

import org.example.interfaces.Caretaker;
import org.example.interfaces.Memento;
import org.example.models.Song;

import java.util.Stack;

public class SpotifyApp implements Caretaker<Song> {
    Stack<Song> songHistory = new Stack<>();

    public void addMemento(Song memento) {
        songHistory.push(memento);
    }

    public Song getMemento() {
        return songHistory.pop();
    }
}
