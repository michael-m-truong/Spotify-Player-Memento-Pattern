package org.example;

import org.example.interfaces.Memento;
import org.example.interfaces.Originator;
import org.example.models.Song;

public class SpotifySession implements Originator<Song> {
    private String currentSong;  // state

    /**
     * Change the current state to current Song
     * Override method from Originator interface
     * @param memento Song to be set as current state
     */
    @Override
    public void setMemento(Song memento) {
        this.currentSong = memento.getState();
    }

    /**
     * Create new Song based on current state
     * Override method from Originator interface
     * @return new Song instance for current state
     */
    @Override
    public Song createMemento() {
        return new Song(currentSong);
    }

    /**
     * Get current song being played
     * @return current state of Song instance
     */
    public String getCurrentSong() {
        return currentSong;
    }

    /**
     * Change the current state to current Song
     * @param song Song to be set as current state
     */
    public void playSong(Song song) {
        this.currentSong = song.getSongName();
    }
}
