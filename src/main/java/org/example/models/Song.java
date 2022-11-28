package org.example.models;

import org.example.interfaces.Memento;

public class Song implements Memento<String> {
    private final String songName;

    /**
     * Constructor for Song class to initialize Song name
     * @param songName Song name to be set for Song instance
     */
    public Song(String songName) {
        this.songName = songName;
    }

    /**
     * Get state of current Song
     * Override method from Memento interface
     * @return name of Song instance
     */
    @Override
    public String getState() {
        return songName;
    }

    /**
     * Accessor method to get Song name
     * @return name of Song instance
     */
    public String getSongName() {
        return songName;
    }
}
