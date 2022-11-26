package org.example.models;

import org.example.interfaces.Memento;

public class TrackMetadata implements Memento<TrackMetadata> {
    private final String songArtist;
    private final String songTitle;
    private final String albumName;
    private final int runTime;
    private final String genre;
    private final int explicitTag;

    public TrackMetadata(String sArtist, String songTitle, String albumName, int runTime, String genre, int explicitTag){
        this.songTitle = songTitle;
        this.songArtist = sArtist; 
        this.albumName = albumName;
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
    
    public String getAlbumName(){
        return albumName;
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