package org.example.models;

import javax.sound.midi.Track;

import org.example.interfaces.Memento;

public class Song implements Memento<TrackMetadata> {
    private final TrackMetadata metadata;

    public Song(TrackMetadata metadata){
        this.metadata = metadata;
    }

    @Override
    public TrackMetadata getState() {
        return metadata;
    }

    public TrackMetadata getMetadata() {
        return metadata;
    }
    
}
