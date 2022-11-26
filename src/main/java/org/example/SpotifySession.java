package org.example;

import javax.sound.midi.Track;

import org.example.interfaces.Memento;
import org.example.interfaces.Originator;
import org.example.models.Song;
import org.example.models.TrackMetadata;

public class SpotifySession implements Originator<Song> {
    private TrackMetadata currentSong;  // state

    @Override
    public void setMemento(Song memento) {
        this.currentSong = memento.getState();
    }

    @Override
    public Song createMemento() {
        return new Song(currentSong);
    }

    public TrackMetadata getCurrentSong() {
        return currentSong;
    }

    public void playSong(Song song) {
        this.currentSong = song.getMetadata();
    }
}
