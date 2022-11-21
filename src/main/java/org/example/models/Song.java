package org.example.models;

import org.example.interfaces.Memento;

public class Song implements Memento<String> {
    private final String songName;

    public Song(String songName) {
        this.songName = songName;
    }

    @Override
    public String getState() {
        return songName;
    }

    public String getSongName() {
        return songName;
    }
}
