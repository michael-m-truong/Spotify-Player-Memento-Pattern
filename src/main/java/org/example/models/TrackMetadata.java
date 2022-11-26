package org.example.models;

import org.example.interfaces.Memento;

public class TrackMetadata implements Memento<TrackMetadata> {
    private final String songArtist;
    private final int runTime;
    private final String genre;
    private final String songTitle;
    private final int explicitTag;

    public TrackMetadata(String sArtist, String songTitle, int runTime, String genre, int explicitTag){
        this.songTitle = songTitle;
        this.songArtist = sArtist; 
        this.runTime = runTime;
        this.genre = genre;
        this.explicitTag = explicitTag;
    }

    @Override
    public TrackMetadata getState() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getArtistName(){
        return songArtist; 
    }

    public String getSongTitle(){
        return songTitle;
    }

    public int getRunTime(){
        return runTime;
    }

    public String getGenre(){
        return genre;
    }

    public int getExplicitTag(){
        return explicitTag;
    }

}