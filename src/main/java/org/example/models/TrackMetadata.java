package org.example.models;

import org.example.interfaces.Memento;

public class TrackMetadata implements Memento<TrackMetadata> {
    private final String songName;
    private final String songArtist;

    public TrackMetadata(Song song,String sArtist){
        this.songName = song.getSongName(); 
        this.songArtist = sArtist; 
    }

    @Override
    public TrackMetadata getState() {
        // TODO Auto-generated method stub
        return null;
    }


    public String getSongName(){
        return songName; 
    }


    public String getArtistName(){
        return songArtist; 
    }

    

}