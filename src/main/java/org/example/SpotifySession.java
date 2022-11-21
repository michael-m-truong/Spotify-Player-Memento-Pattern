package org.example;

import org.example.interfaces.Memento;
import org.example.interfaces.Originator;
import org.example.models.Song;

public class SpotifySession implements Originator {

    private String currentSong;  // state
    private String currentArtist;
    private String currentPlaylist; // state

    /** Play previous song */
    @Override
    public void setMemento(Memento memento) {
        this.currentSong = memento.getState();
        /*this.currentArtist = */
    }

    /** Create memento to pass to caretaker */
    @Override
    public Memento createMemento() {
        return new Song(currentSong, currentArtist);
    }

    public String getCurrentSong() {
        return currentSong;
    }

    public String getCurrentArtist() {
        return currentArtist;
    }
    
    /** Plays next song from playlist */
    public void nextSong() {

    }

    public void play(Song song) {
        this.currentSong = song.getSongName();
        this.currentArtist = song.getArtistName();
    }

    
    
}
