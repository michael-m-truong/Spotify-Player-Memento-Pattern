package org.example.models;

import org.example.interfaces.Memento;

public class Song implements Memento {

    private final String songName;

    public Song(String songName) {
        this.songName = songName;
    }

    /** Memento should have a getter but NOT a setter */
    @Override
    public String getState() {
        return songName;
    }


    public String getSongName() {
        return songName;
    }
}
