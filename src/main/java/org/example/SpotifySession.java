package org.example;

import org.example.interfaces.Memento;
import org.example.interfaces.Originator;
import org.example.models.Song;

public class SpotifySession implements Originator {
    private String currentSong;  // state

    @Override
    public void setMemento(Memento memento) {
        this.currentSong = memento.getState();
    }

    @Override
    public Memento createMemento() {
        return new Song(currentSong);
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public void playSong(Song song) {
        this.currentSong = song.getSongName();
    }
}
